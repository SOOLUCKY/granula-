package com.lyb.granula.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lyb.granula.common.constant.CommonConstant;
import com.lyb.granula.common.util.HttpUtils;
import com.lyb.granula.entity.DataPrescription;
import com.lyb.granula.entity.DataPrescriptionDetail;
import com.lyb.granula.entity.ext.RecipelInfoExt;
import com.lyb.granula.entity.ext.RecipelItemKljExt;
import com.lyb.granula.mapper.DataPrescriptionDetailMapper;
import com.lyb.granula.mapper.DataPrescriptionMapper;
import com.lyb.granula.service.DataPrescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/**
 * Created by xiechunlu on 2018-05-08 上午11:27
 */
@Service
@Slf4j
public class DataPrescriptionServiceImpl implements DataPrescriptionService {

    @Autowired
    private DataPrescriptionMapper dataPrescriptionMapper;

    @Autowired
    private DataPrescriptionDetailMapper dataPrescriptionDetaiMapper;

    @Value("${url.prescription-url}")
    private String prescriptionUrl;

    @Override
    public void createTable() {
        dataPrescriptionMapper.createTable();
        dataPrescriptionDetaiMapper.createTable();
    }

    @Override
    public void prescriptionDataSync() {

        //1. 获取处方及处方信息
        String data;
        try {
            data = HttpUtils.requestGet(prescriptionUrl);
            log.info(data);
        } catch (Exception e) {
            log.info("数据获取接口调用失败", e);
            throw new RuntimeException("数据获取接口调用失败");
        }

        //2. 将数据同步到设备
        if (StringUtils.isNotBlank(data)) {
            List<RecipelInfoExt> recipelInfoExts = JSONObject.parseArray(data, RecipelInfoExt.class);

            recipelInfoExts.forEach(recipelInfoExt -> {

                DataPrescription prescription = this.recipelInfoToDataPrescription(recipelInfoExt);

                List<DataPrescriptionDetail> details = new ArrayList<>(0);

                for (int i = 0; i < recipelInfoExt.getKljItems().size(); i++) {
                    DataPrescriptionDetail detail = this.recipelItemToDataPrescriptionDetail(recipelInfoExt.getKljItems(), recipelInfoExt.getKljItems().get(i));
                    detail.setNo(i + 1);
                    details.add(detail);
                }

                this.precriptionDataAdd(prescription, details);
            });
        }
    }

    private DataPrescription recipelInfoToDataPrescription(RecipelInfoExt recipelInfoExt) {


        DataPrescription prescription = new DataPrescription();
        prescription.setId(recipelInfoExt.getId());
        prescription.setName(recipelInfoExt.getMemberName());
        prescription.setSex(recipelInfoExt.getMemberSex());
        prescription.setAge(recipelInfoExt.getAge());
        prescription.setTele(recipelInfoExt.getMemberMobile());
        prescription.setDoctorName(recipelInfoExt.getDoctorName());
        prescription.setCreatorName(null);
        prescription.setCreationTime(null);
        prescription.setQuantity(recipelInfoExt.getTotalNum() * 2);
        prescription.setQuantityDay(recipelInfoExt.getTotalNum());
        prescription.setPriceTotal(recipelInfoExt.getPrice());
        prescription.setPaymentStatus("PAYED");
        prescription.setDataSource("HIS");
        prescription.setDeviceId(null);
        prescription.setProcessStatus("NEW");

        return prescription;
    }

    private DataPrescriptionDetail recipelItemToDataPrescriptionDetail(List<RecipelItemKljExt> items, RecipelItemKljExt recipelItem) {

        DataPrescriptionDetail detail = new DataPrescriptionDetail();
        detail.setId(recipelItem.getReciId());
        detail.setGranuleId(recipelItem.getDrugId());
        detail.setGranuleName(recipelItem.getDrugName());
        detail.setDoseHerb(recipelItem.getTotalNum());
        detail.setEquivalent(0);
        detail.setDose(recipelItem.getKljTotalNum());

        return detail;
    }

    private Integer precriptionDataAdd(DataPrescription prescription, List<DataPrescriptionDetail> details) {

        Integer result = dataPrescriptionMapper.insert(prescription);

        for (DataPrescriptionDetail detail : details) {
            dataPrescriptionDetaiMapper.insert(detail);
        }

        return result;
    }
}

package com.lyb.granula.task;

import com.lyb.granula.service.DataPrescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xiechunlu on 2018-05-08 下午1:36
 */
@Component
@Slf4j
public class DataPrescriptionTask {

    private static final String RECIPEL_DATA_SYNC = "颗粒剂处方数据同步定时任务";
    private static final int TIME = 1000 * 60 * 2;

    @Autowired
    private DataPrescriptionService dataPrescriptionService;

    /**
     * 每两分钟执行一次,将his系统处方数据同步到设备
     */
    @Scheduled(fixedDelay = TIME, initialDelay = 0)
    public void rescriptionDataSync() {
        log.info("start to execute " + RECIPEL_DATA_SYNC);
        try {
            dataPrescriptionService.prescriptionDataSync();
        } catch (Exception e) {
            log.info(RECIPEL_DATA_SYNC + "执行异常", e);
        }
    }
}

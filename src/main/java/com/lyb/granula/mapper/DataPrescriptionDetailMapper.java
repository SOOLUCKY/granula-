package com.lyb.granula.mapper;

import com.lyb.granula.entity.DataPrescription;
import com.lyb.granula.entity.DataPrescriptionDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataPrescriptionDetailMapper {

    void createTable();

    Integer batchSave(@Param("details") List<DataPrescriptionDetail> details);

    Integer insert(DataPrescriptionDetail prescription);

}
package com.lyb.granula.mapper;

import com.lyb.granula.entity.DataPrescription;

public interface DataPrescriptionMapper {

    void createTable();

    Integer insert(DataPrescription prescription);
}
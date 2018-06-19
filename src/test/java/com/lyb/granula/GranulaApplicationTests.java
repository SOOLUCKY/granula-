package com.lyb.granula;

import com.lyb.granula.service.DataPrescriptionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GranulaApplicationTests {

    @Autowired
    private DataPrescriptionService dataPrescriptionService;

    @Test
    public void contextLoads() {
        dataPrescriptionService.prescriptionDataSync();
    }

}

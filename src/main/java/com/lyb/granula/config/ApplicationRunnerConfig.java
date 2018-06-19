package com.lyb.granula.config;

import com.lyb.granula.service.DataPrescriptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by xiechunlu on 2018-05-08 上午10:14
 */
@SpringBootConfiguration
@Slf4j
public class ApplicationRunnerConfig {

    @Bean
    ApplicationRunner appRunner() {
        return new AppRunner();
    }

    private static class AppRunner implements ApplicationRunner {

        @Autowired
        private DataPrescriptionService dataPrescriptionService;

        @Override
        public void run(ApplicationArguments args) throws Exception {

            log.info("app runner------------");
            //dataPrescriptionService.createTable();
        }
    }
}

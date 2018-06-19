package com.lyb.granula;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.lyb.granula.mapper")
@EnableScheduling
public class GranulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GranulaApplication.class, args);
    }
}

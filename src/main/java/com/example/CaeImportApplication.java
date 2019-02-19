package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@ServletComponentScan
@MapperScan("com.example.*.dao")
public class CaeImportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaeImportApplication.class, args);
    }
}

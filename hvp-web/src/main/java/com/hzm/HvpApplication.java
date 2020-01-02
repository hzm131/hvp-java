package com.hzm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.hzm.mapper")
@SpringBootApplication
public class HvpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HvpApplication.class, args);
    }

}

package com.xzn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xzn.mapper")
public class TestOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestOrderApplication.class, args);
    }

}

package com.kelo7.passjava.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.kelo7.passjava.content.dao")
@SpringBootApplication
public class PassjavaContentApplication {

    public static void main(String[] args) {

        SpringApplication.run(PassjavaContentApplication.class, args);
    }

}
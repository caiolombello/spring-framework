package com.dio.springbootopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOpenfeignApplication.class, args);
    }

}

package com.computernerd.jpamapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringDataJpaMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaMappingApplication.class, args);
    }

}

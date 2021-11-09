package com.arman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author arman
 */
@SpringBootApplication
@MapperScan("com.arman.mapper")
public class PersonalWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalWebProjectApplication.class, args);
    }

}

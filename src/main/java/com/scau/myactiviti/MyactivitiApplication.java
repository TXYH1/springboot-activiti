package com.scau.myactiviti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.activiti.spring.boot.SecurityAutoConfiguration.class
})
public class MyactivitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyactivitiApplication.class, args);
    }

}

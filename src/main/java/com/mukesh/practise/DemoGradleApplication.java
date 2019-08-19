package com.mukesh.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DemoGradleApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoGradleApplication.class,args);
    }
}

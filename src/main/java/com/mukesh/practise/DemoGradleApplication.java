package com.mukesh.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories(basePackages="com.mukesh.practise.dao")
public class DemoGradleApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoGradleApplication.class,args);
    }
}

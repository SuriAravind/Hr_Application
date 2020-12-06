package com.ashu.humanresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages="com.ashu.humanresource.*")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.ashu.humanresource.*")
@EnableJpaAuditing
public class HumanResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HumanResourceApplication.class , args);
    }

}

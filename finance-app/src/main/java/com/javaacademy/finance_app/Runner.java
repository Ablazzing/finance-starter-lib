package com.javaacademy.finance_app;

import com.javaacademy.finance_starter.FinanceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Runner.class);
        FinanceService financeService = context.getBean(FinanceService.class);
        System.out.println();
    }
}

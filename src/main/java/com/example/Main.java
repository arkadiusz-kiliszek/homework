package com.example;

import com.example.service.CalculateAreaService;
import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CalculateAreaService areaService = (CalculateAreaService) applicationContext.getBean("calculateAreaService");
        areaService.calculateAreaOfSquare();
    }
}
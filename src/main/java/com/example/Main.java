package org.example;

import org.example.config.AppConfig;
import org.example.service.CalculateAreaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CalculateAreaService areaService = (CalculateAreaService) applicationContext.getBean("calculateAreaService");
        areaService.calculateAreaOfSquare();
    }
}
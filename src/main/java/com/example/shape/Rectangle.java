package com.example.shape;

;
import com.example.config.condition.RectangleCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Conditional(RectangleCondition.class)
public class Rectangle implements Shape {
    @Override
    public double calculateArea() {
        System.out.println("Liczymy pole prostoka! Podaj boki a oraz b: ");
        System.out.println("Podaj a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Podaj b: ");
        double b = scanner.nextDouble();
        return a * b;
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}

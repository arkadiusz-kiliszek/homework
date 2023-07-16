package com.example.shape;

import com.example.config.condition.DefaultShapeCondition;
import com.example.config.condition.SquareCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Conditional(SquareCondition.class)
public class Square implements Shape {
    @Override
    public double calculateArea() {
        System.out.println("Liczymy pole kwadratu! Podaj bok a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Bok a to " + a);
        return Math.pow(a, 2);
    }

    @Override
    public String getName() {
        return "square";
    }
}

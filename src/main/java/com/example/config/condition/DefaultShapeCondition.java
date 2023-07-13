package com.example.config.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DefaultShapeCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return !"square".equalsIgnoreCase(context.getEnvironment().getProperty("calculate.area.shape", String.class));
    }
}

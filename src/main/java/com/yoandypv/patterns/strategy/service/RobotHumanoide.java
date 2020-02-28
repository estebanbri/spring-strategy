package com.yoandypv.patterns.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class RobotHumanoide implements IRobotStrategy {

    @Override
    public RobotType getType() {
        return RobotType.HUMANOIDE;
    }

    @Override
    public String getFormaMoverse() {
        return "Por pasos";
    }
}

package com.yoandypv.patterns.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class RobotKangoro implements IRobotStrategy {

    @Override
    public RobotType getType() {
        return RobotType.KANGORO;
    }

    @Override
    public String getFormaMoverse() {
        return "Salta";
    }
}

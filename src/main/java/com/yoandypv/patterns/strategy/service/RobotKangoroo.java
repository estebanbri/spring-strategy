package com.yoandypv.patterns.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class RobotKangoroo implements IRobotStrategy {

    @Override
    public RobotType getType() {
        return RobotType.KANGOROO;
    }

    @Override
    public String getWayToMove() {
        return "Salta";
    }
}

package com.yoandypv.patterns.strategy.service;

public interface IRobotStrategy {
    RobotType getType();
    String getWayToMove();
}

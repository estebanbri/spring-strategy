package com.yoandypv.patterns.strategy.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RobotContext implements InitializingBean {

    private List<IRobotStrategy> robotStrategies;

    private Map<RobotType,IRobotStrategy> map;

    public RobotContext(List<IRobotStrategy> robotStrategies) {
        this.robotStrategies = robotStrategies;
    }

    @Override
    public void afterPropertiesSet() {
        this.map = new HashMap<>();
        robotStrategies.forEach(robotStrategies -> map.put(robotStrategies.getType(), robotStrategies));
    }

    public String retrieveWayToMove(RobotType robotType) {
        if (!RobotType.exists(robotType))
            return "N/A";

        return this.map.get(robotType).getWayToMove();
    }


}

package com.yoandypv.patterns.strategy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RobotContext {

    @Autowired
    private List<IRobotStrategy> robotStrategies;

    private Map<RobotType,IRobotStrategy> map;

    @PostConstruct
    public void setup() {
        this.map = new HashMap<>();
        robotStrategies.forEach(robotStrategies -> map.put(robotStrategies.getType(), robotStrategies));
    }

    public String getFormaMoverse(RobotType robotType) {
        return this.map.get(robotType).getFormaMoverse();
    }

}

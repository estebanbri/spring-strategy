package com.yoandypv.patterns.strategy.controller;

import com.yoandypv.patterns.strategy.service.RobotContext;
import com.yoandypv.patterns.strategy.service.RobotType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class RobotController {

    @Autowired
    private RobotContext robotContext;

    @GetMapping("robots/formamoverse/{robottype}")
    public ResponseEntity<String> getFormaMoverse(@PathVariable("robottype")RobotType robotType) {
        return new ResponseEntity<String>(this.robotContext.getFormaMoverse(robotType), HttpStatus.OK);
    }

}

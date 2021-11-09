package com.vinu.limitsservice.controller;

import com.vinu.limitsservice.bean.Limits;
import com.vinu.limitsservice.configuration.PropertyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private PropertyConfiguration propertyConfiguration;

    @Autowired
    public LimitsController(PropertyConfiguration propertyConfiguration) {
        this.propertyConfiguration = propertyConfiguration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(propertyConfiguration.getMinimum(),propertyConfiguration.getMaximum());
    }
}

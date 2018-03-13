package com.tencent.cloud.tsf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chazling on 2018/1/16.
 */
@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class.getName());

    @RequestMapping(value = "/")
    public String home() {
        logger.info("home is being called");
        return "demo provider echos\n";
    }

    @RequestMapping(value = "/health")
    public String health() {
        logger.info("health is being called");
        return "demo provider healthy\n";
    }

    @RequestMapping(value = "/provider")
    public String provider() {
        logger.info("provider is being called");
        return "resource providing ...\n";
    }
}
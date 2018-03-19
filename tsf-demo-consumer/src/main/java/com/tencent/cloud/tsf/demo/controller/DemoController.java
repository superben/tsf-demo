package com.tencent.cloud.tsf.demo.controller;

import com.tencent.cloud.tsf.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chazling on 2018/1/17.
 */
@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class.getName());

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/")
    public String home() {
        logger.info("home is being called");
        return "demo consumer echos\n";
    }

//    @RequestMapping(value = "/health")
//    public String health() {
//        logger.info("health is being called");
//        return "demo consumer healthy\n";
//    }

    @RequestMapping(value = "/consumer")
    public String consumer() {
        logger.info("consumer is being called");
        return "conumser calling ...\n" + demoService.provider();
    }
}
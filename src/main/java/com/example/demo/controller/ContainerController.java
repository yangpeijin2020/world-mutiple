package com.example.demo.controller;

import com.example.demo.bean.stacker.Container;
import com.example.demo.service.ContainerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContainerController {

    Logger logger=LoggerFactory.getLogger(ContainerController.class);


    @Autowired
    ContainerService  containerService;


    @ResponseBody
    @GetMapping("container/{containerNo}")
    public Container getContainerByContainerNo(@PathVariable String  containerNo){
        Container   container=containerService.getContainerByContainerNo(containerNo);
        logger.info("ContainerController======containerNo"+container);
        return  container;
    }


}

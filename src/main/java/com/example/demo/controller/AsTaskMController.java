package com.example.demo.controller;


import com.example.demo.bean.stacker.AsTaskM;
import com.example.demo.service.AsTaskMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AsTaskMController {

    @Autowired
    public AsTaskMService    asTaskMService;

    @ResponseBody
    @GetMapping("asTaskM/{id}")
    public AsTaskM getAsTaskMByID(@PathVariable  Long  id){
        AsTaskM   asTaskM=  asTaskMService.getAsTaskMByID(id);
        return   asTaskM;
    }

    @ResponseBody
    @GetMapping("asTaskM/{container}")
    public AsTaskM getAsTaskMByContainer(@PathVariable  String  containerNo){
        AsTaskM   asTaskM=  asTaskMService.getAsTaskMByContainer(containerNo);
        return   asTaskM;
    }




}

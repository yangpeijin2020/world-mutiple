package com.example.demo.controller;

import com.example.demo.bean.stacker.AsTaskC;
import com.example.demo.service.AsTaskCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AsTaskCController {

    @Autowired
    public AsTaskCService asTaskCService;

//    @ResponseBody
//    @GetMapping("asTaskM/{id}")
//    public AsTaskC getAsTaskMByID(@PathVariable Long  id){
//        AsTaskC   asTaskM=  asTaskCService.getAsTaskMByID(id);
//        return   asTaskM;
//    }

    @ResponseBody
    @GetMapping("asTaskC/{containerNo}")
    public AsTaskC getAsTaskMByContainer(@PathVariable  String  containerNo){
        AsTaskC   asTaskM=  asTaskCService.getAsTaskCByContainer(containerNo);
        return   asTaskM;
    }




}

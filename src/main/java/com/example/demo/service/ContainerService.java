package com.example.demo.service;

import com.example.demo.bean.stacker.Container;
import com.example.demo.mapper.ContainerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContainerService {


    @Autowired
    ContainerMapper containerMapper;


    public Container   getContainerByContainerNo(String  containerNo){
       Container  container= containerMapper.getContainerByContainerNo(containerNo);
        return container;
    }



}

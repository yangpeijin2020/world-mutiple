package com.example.demo.service;

import com.example.demo.bean.stacker.AsTaskM;
import com.example.demo.mapper.AsTaskMMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsTaskMService {

    @Autowired
    public AsTaskMMapper asTaskMMapper;

    AsTaskM  asTaskM;


    public AsTaskM  getAsTaskMByID(Long  id ){

        asTaskM= asTaskMMapper.getAsTaskMByID(id);

        return asTaskM;
    }


    public AsTaskM  getAsTaskMByContainer(String  containerNo){

        asTaskM= asTaskMMapper.getAsTaskMByContainer(containerNo);

        return asTaskM;
    }

}

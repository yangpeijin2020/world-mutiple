package com.example.demo.mapper;


import com.example.demo.bean.stacker.AsTaskC;
import org.springframework.stereotype.Repository;

@Repository
public interface AsTaskCMapper {
    public AsTaskC getAsTaskCByID(Long  id);
     public   AsTaskC getAsTaskCByContainer(String  containerNo);
}
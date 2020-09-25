package com.example.demo.mapper;


import com.example.demo.bean.stacker.AsTaskM;
import org.springframework.stereotype.Repository;

@Repository
public interface AsTaskMMapper {
    public AsTaskM   getAsTaskMByID(Long  id );

    public AsTaskM    getAsTaskMByContainer(String  container);
}
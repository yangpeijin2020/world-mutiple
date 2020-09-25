package com.example.demo.mapper;

import com.example.demo.bean.stacker.Container;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerMapper {




    public Container getContainerByContainerNo(String  containerNo);
}
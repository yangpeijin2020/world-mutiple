package com.example.demo.service;

import com.example.demo.bean.City;
import com.example.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

        @Autowired
        public CityMapper  cityMapper;
        public   City   getCityById(int  id ){
            return cityMapper.getCityById(id);
        }
}

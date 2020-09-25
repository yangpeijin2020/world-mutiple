package com.example.demo.mapper;

import com.example.demo.bean.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMapper {

       public City getCityById(int id );
}
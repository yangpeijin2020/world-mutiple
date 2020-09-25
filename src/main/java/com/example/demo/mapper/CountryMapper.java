package com.example.demo.mapper;

import com.example.demo.bean.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMapper {
       public Country getCountryByCode(String   code);
}
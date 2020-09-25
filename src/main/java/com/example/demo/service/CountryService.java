package com.example.demo.service;

import com.example.demo.bean.Country;
import com.example.demo.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryService {

    @Autowired
    public CountryMapper  countryMapper;

        public Country  getCountryByCode(String  code){
            return    countryMapper.getCountryByCode(code);
        };
}

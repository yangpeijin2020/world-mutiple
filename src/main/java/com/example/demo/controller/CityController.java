package com.example.demo.controller;


import com.example.demo.bean.City;
import com.example.demo.bean.Country;
import com.example.demo.service.CityService;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CityController {

    @Autowired
    public CityService  cityService;
    @Autowired
    public CountryService countryService;

    @ResponseBody
    @GetMapping("/city/{id}")
    public City cityById(@PathVariable  int  id){
//        cityService.getCityById(id);
        return  cityService.getCityById(id);
    }

    @ResponseBody
    @GetMapping("/country/{code}")
    public Country getCountyByCode(@PathVariable  String  code){
//        cityService.getCityById(id);
        return  countryService.getCountryByCode(code);
    }
}

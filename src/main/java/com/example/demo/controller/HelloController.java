package com.example.demo.controller;
import com.example.demo.bean.City;
import com.example.demo.bean.Department;
import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping({"/index","/"})
    public  String   index(Map<String,Object> map){
        System.out.println("index==========");
        map.put("hello","helloWorld!");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return   "/index";
    }
    @GetMapping({"/dept"})
    @ResponseBody
    public  Department   dept(Map<String,Object> map){
        Department dept=new Department();
        dept.setDepartmentName("测试部");
        dept.setId(20);
        return   dept;
    }

    @RequestMapping("/list")
    public String itemsList(Map map) {
    /*    String sql = "select * from items";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);*/
        List  list=Arrays.asList("Apple", "Banana", "Orange");
        map.put("list",list);
        return  "test";
    }


    }

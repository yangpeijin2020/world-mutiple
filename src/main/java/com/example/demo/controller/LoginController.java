package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public  String  login(String  name, String  password, Map<String,Object> map, HttpSession  session){
        System.out.println("name = " + name + ", password = " + password);
        if(!StringUtils.isEmpty(name)&&"123456".equals(password)){
                session.setAttribute("userName",name);
                return "/stacker";
        }else {
                map.put("msg","username  or  password  is  not  correct");
                return "index";
        }
    }


}

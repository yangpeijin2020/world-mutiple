package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/coo")
public class CookieDemo {


    @GetMapping("/readC")
    public String readCookie(@CookieValue(value = "username",
            defaultValue = "Atta") String username) {
        return "Hey! My username is " + username;
    }

    @RequestMapping("/change")
    public String setCookie(HttpServletResponse response) {
        // 创建一个 cookie对象
        Cookie cookie = new Cookie("username", "Jovan");
        //将cookie对象加入response响应
        response.addCookie(cookie);
        return "Username is changed!";
    }


    @RequestMapping("/add1")
    public String addSession(HttpServletRequest httpServletRequest,
                             @RequestParam("username")String username) {
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("username",username);
        session.setMaxInactiveInterval(10000);
        return "添加成功";
    }

    @RequestMapping("/show1")
    public Object showSession(HttpServletRequest httpServletRequest) {
        HttpSession session = httpServletRequest.getSession();
        Object object = session.getAttribute("username");
        return object;
    }

}

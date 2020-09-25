package com.example.demo.config;


import com.example.demo.servlet.LoginFilter;
import com.example.demo.servlet.MyFilter;
import com.example.demo.servlet.MyListener;
import com.example.demo.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.logging.Filter;


@Configuration
public class ServerConfig {
/*
    @Bean
    public ServletRegistrationBean   myServlet(){
        ServletRegistrationBean  servletRegistrationBean  =new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean  myFileter(){
        FilterRegistrationBean   registrationBean=new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return   registrationBean;
    }

//    @Bean
    public FilterRegistrationBean   loginFileter(){
        FilterRegistrationBean  registrationBean  =new FilterRegistrationBean();
        registrationBean.setFilter(new LoginFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("excludeUrls", "/,/index");
        registrationBean.setOrder(0);
        return registrationBean;
    }


    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return registrationBean;
    }*/
}


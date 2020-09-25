package com.example.demo.servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest  request= (HttpServletRequest) servletRequest;
        HttpServletResponse  response= (HttpServletResponse) servletResponse;

        Object   user=request.getSession().getAttribute("userName");
        if (user == null){
            request.setAttribute("msg","你没有权限登录");
            request.getRequestDispatcher("/index").forward(request,response);
        }else {
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}

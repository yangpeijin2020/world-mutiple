package com.example.demo.controller;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmpController {

    @Autowired
    public EmployeeDao  employeeDao;

    @GetMapping("/emp/list")
    public String  list(Model model){

        Collection<Employee> emps= employeeDao.getAll();
        model.addAttribute("emps",emps);
        return  "list";
    }
}

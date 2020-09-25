package com.example.demo;

import com.example.demo.bean.stacker.StackerConfig;
import com.example.demo.config.OrderConfig;
import com.example.demo.service.AsTaskCService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {
    Logger logger= LoggerFactory.getLogger(DemoApplication.class);
    int i=1;
    @Autowired
    AsTaskCService asTaskCService;

    @Autowired
    StackerConfig stackerConfig;

    @Autowired
    OrderConfig  orderConfig;


    @Test
    void contextLoads() {

        DemoApplicationTests  demoApplicationTests=new DemoApplicationTests();
        System.out.println(demoApplicationTests.getClass().getClassLoader());
        System.out.println(demoApplicationTests.getClass().getClassLoader().getParent());
        System.out.println(demoApplicationTests.getClass().getClassLoader().getParent().getParent());
        System.out.println(demoApplicationTests.getClass().getClassLoader().getParent().getParent().getParent());
//        StackerBean  sb=new StackerBean();
//        sb.getReg();
//        OrderConfig  orderConfig=new OrderConfig();
    }

    @Test
    void   testbuqi(){
    }
}

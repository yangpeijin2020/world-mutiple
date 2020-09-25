package com.example.demo.controller;

import com.example.demo.bean.stacker.OrderDto;
import com.example.demo.config.OrderConfig;
import com.example.demo.service.OrderService;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping("/order")
public class OrderReceiveController {
    /**
     * ICR  外向检测口
     * RTA
     * RTD   入库站台口
     * RPD
     * CTC   终点位置
     * TSE  堆垛机编码
     * CTA  堆垛机抱起容器的位置
     * CPD  目的储位
     * PIS  储位
     *
     *
     *
     *
     *
     */


    Logger logger= LoggerFactory.getLogger(OrderReceiveController.class);
    @Autowired
    OrderService  orderService;
    @Autowired
    OrderConfig  orderConfig;

    @RequestMapping("order/inbound")
    public  String    inbound(Map<String,Object>  map){
        List  inboundList=orderConfig.inbound;
        map.put("inboundList",inboundList);
        return  "stacker";
    }
    @RequestMapping("order/outbound")
    public List    outbound(){
        List  inbloundList=orderConfig.inbound;
        return  inbloundList;
    }


    @RequestMapping(value = "/ICR")
    @ResponseBody
    public   String  ICR(@RequestBody   OrderDto order){
        logger.info("containerNo:"+order.containerNo+order.point);
        String  ICR1=orderService.ICR(order.containerNo,order.point);
        return   ICR1;
    }

    /**
     * 接受指令通用方法
     * 所有指令均走此方法
     * @param order
     * @return
     */
    @RequestMapping(value={"/RTA","/*"})
    @ResponseBody
    public   String  order(@RequestBody   OrderDto order){
        logger.info("containerNo:"+order.containerNo+order.point+"instruction"+order.instruction);

        String  orderResponseText=orderService.assembleOrder(order);
//        return   orderResponseText;
        return   null;
    }

}

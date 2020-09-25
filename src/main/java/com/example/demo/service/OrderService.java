package com.example.demo.service;

import com.example.demo.bean.stacker.AsTaskC;
import com.example.demo.bean.stacker.OrderDto;
import com.example.demo.mapper.AsTaskCMapper;
import com.example.demo.util.TcpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    Logger logger= LoggerFactory.getLogger(AsTaskCService.class);
    @Autowired
    public AsTaskCMapper asTaskCMapper;
    AsTaskC asTaskC;

    public String ICR(String  containerNo, String  fromPoint){
        String  uuidBq=TcpUtil.SpaceComplete(20,TcpUtil.getUid(),1);
        String  fromPointBq=TcpUtil.SpaceComplete(20,fromPoint,1);
        asTaskC=getAsTaskCByContainer(containerNo);
        String  businessNo=asTaskC.getWcsTaskNo();
        StringBuffer  stringBuffer=new StringBuffer("{");
        stringBuffer.append("1");
        stringBuffer.append("0000");
        stringBuffer.append("JD3601");
        stringBuffer.append("WCS001");
        stringBuffer.append("ICR");
        String  containerNoBq=TcpUtil.SpaceComplete(18,containerNo,1);
        String  wcs_task_no=asTaskC.getWcsTaskNo();
        stringBuffer.append(uuidBq);
        stringBuffer.append(containerNoBq);
        stringBuffer.append(fromPointBq);
        stringBuffer.append("}");
        logger.info("stringBuffer"+stringBuffer);
        return stringBuffer.toString();
    }

    public String CTC(String  containerNo, String  fromPoint){
        String  uuidBq=TcpUtil.SpaceComplete(20,TcpUtil.getUid(),1);
        String  fromPointBq=TcpUtil.SpaceComplete(20,fromPoint,1);
        asTaskC=getAsTaskCByContainer(containerNo);
        String  businessNo=asTaskC.getWcsTaskNo();
        StringBuffer  stringBuffer=new StringBuffer("{");
        stringBuffer.append("1");
        stringBuffer.append("0000");
        stringBuffer.append("JD3601");
        stringBuffer.append("WCS001");
        stringBuffer.append("ICR");
        String  containerNoBq=TcpUtil.SpaceComplete(18,containerNo,1);
        String  wcs_task_no=asTaskC.getWcsTaskNo();
        stringBuffer.append(uuidBq);
        stringBuffer.append(containerNoBq);
        stringBuffer.append(fromPointBq);
        stringBuffer.append("}");
        logger.info("stringBuffer"+stringBuffer);
        return stringBuffer.toString();
    }
    public String assembleOrder(OrderDto order){
        StringBuffer  stringBuffer=new StringBuffer("{");
        String  uuidBq=TcpUtil.SpaceComplete(20,TcpUtil.getUid(),1);
        if (order.instruction.equals("REG")||order.instruction.equals("ACK")){
            stringBuffer.append(order.instruction);
            stringBuffer.append(uuidBq);
            stringBuffer.append("}");
        }
        asTaskC=getAsTaskCByContainer(order.containerNo);
        String  businessNo=asTaskC.getWcsTaskNo();
        stringBuffer.append("1");
        stringBuffer.append("0000");
        stringBuffer.append("JD3601");
        stringBuffer.append("WCS001");
        stringBuffer.append(order.instruction);
        String  containerNoBq=TcpUtil.SpaceComplete(18,order.containerNo,1);
        stringBuffer.append(uuidBq);
        String  fromPointBq=TcpUtil.SpaceComplete(20,order.point,1);
        if (containerNoBq!=null&&containerNoBq!=""){
            stringBuffer.append(containerNoBq);
        }
      /*  if (fromPoint!=null&&fromPoint!=""){
            stringBuffer.append(fromPointBq);
        }*/
        stringBuffer.append("}");
        logger.info("stringBuffer"+stringBuffer);
        return stringBuffer.toString();
    }


    public AsTaskC getAsTaskCByContainer( String  containerNo){
        AsTaskC   asTaskC=  asTaskCMapper.getAsTaskCByContainer(containerNo);
        return   asTaskC;
    }
}

package com.example.demo.service;

import com.example.demo.bean.stacker.AsTaskC;
import com.example.demo.mapper.AsTaskCMapper;
import com.example.demo.util.TcpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AsTaskCService {

    Logger logger= LoggerFactory.getLogger(AsTaskCService.class);
    @Autowired
    public AsTaskCMapper   asTaskCMapper;
    AsTaskC  asTaskC;

    public String ISR(String  containerNo, String  fromPoint){
        asTaskC=getAsTaskCByContainer(containerNo);
        String  businessNo=asTaskC.getWcsTaskNo();
        StringBuffer  stringBuffer=new StringBuffer("MSGISR");
        String  pointBq =TcpUtil.SpaceComplete(30,fromPoint,1);
        String  containerNoBq=TcpUtil.SpaceComplete(18,containerNo,1);
        String  wcs_task_no=asTaskC.getWcsTaskNo(); 
        stringBuffer.append(pointBq);
        stringBuffer.append("000000001000");

        logger.info("pointBq"+pointBq+",containerNoBq"+containerNoBq+"stringBuffer"+stringBuffer);
        return stringBuffer.toString();
    }




    public  String   Reg(){
//        {10000JD3601WCS001REGJDX201811201649125JM }
        StringBuffer  reg=new StringBuffer();
        reg.append("{");
        reg.append("REG");
        reg.append(TcpUtil.getUid());
        reg.append("}");
        return  reg.toString();
    }

    public AsTaskC getAsTaskCByContainer( String  containerNo){
        AsTaskC   asTaskC=  asTaskCMapper.getAsTaskCByContainer(containerNo);
        return   asTaskC;
    }

}

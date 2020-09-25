package com.example.demo.util;

import com.example.demo.bean.stacker.StackerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

public class TcpUtil {

    static  int    paddingBit=1;
    static Logger  logger  =LoggerFactory.getLogger(TcpUtil.class);
    static Queue  queue=null;
    @Autowired
    static StackerConfig  config;

    public   String  AssembleMessage(String  ContainerNo){

        return null;
    }


    public  static  String   getUid(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd-HH-mm-ss");
        String createdate = sdf.format(date);
        String  Uid=createdate+paddingBit;
        logger.info("Uid"+Uid);
        return   Uid;
    }

    public   static   String   SpaceComplete(int  len,String  source ,int  direction){
        String  target=null;
        if(source.length()<=len){
            if(direction==0){
                target=  String.format("%"+len+"s", source);
            }else {
                target=  String.format("%-"+len+"s", source);
            }
        }else {
            return   "uuid too long";
        }

//        String  target=  String.format("%"+len+"s", source);
        logger.info("target"+target+",length"+target.length());
        return    target;
    }


    public  static  void  send(String bw ) {
        //chat方法
        Socket socket=null;
        DataInputStream in=null;
        DataOutputStream out=null;
        try {
            // 连接到服务器
            logger.info("buf1.tcp_ip:"+config.getServerIp()+",tcp_port:"+config.getServerPort());
//            socket = new Socket(buf1.tcp_ip, Integer.parseInt(buf1.tcp_port));//创建Socket类对象
            socket = new Socket(config.getServerIp(), Integer.parseInt(config.getServerPort()));//创建Socket类对象
            in = new DataInputStream(socket.getInputStream());// 读取服务器端传过来信息的DataInputStream
            if(bw!=null){
                out = new DataOutputStream(socket.getOutputStream());// 向服务器端发送信息的DataOutputStream
                // 把从控制台得到的信息传送给服务器
                out.write(bw.getBytes());//将客户端的信息传递给服务器
            }

            if(socket.getInputStream()!=null){
                int len=0;
                byte[]  buf=new  byte[1024];
                while((len=in.read(buf))!=-1){
                    String   str=new String(buf,0,len);
                    logger.info("queue  add"+str);
                    queue.offer(str);
//                    System.out.println("str:"+str);
                    out.close(); //关闭Socket输出流
                    in.close(); //关闭Socket输入流
                    socket.close(); //关闭Socket
                }
            }
            logger.info("skip  while");
//            out.close(); //关闭Socket输出流
//            in.close(); //关闭Socket输入流
//            socket.close(); //关闭Socket
        } catch (IOException e) {//捕获异常
            System.out.println(e.getMessage());
        }
    }
}

package com.example.demo.bean.stacker;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/stackerConfig.properties")
public class StackerConfig {

   /* serverIp=
    serverPort=*/

    @Value("${serverIp}")
    public  String  serverIp;
    @Value("${serverPort}")
    public  String  serverPort;
    @Value("${buf1}")
    public String buf1;
    @Value("${buf2}")
    public String buf2;
    @Value("${buf3}")
    public String buf3;
    @Value("${buf4}")
    public String buf4;
    @Value("${buf5}")
    public String buf5;
    @Value("${buf6}")
    public String buf6;
    @Value("${buf7}")
    public String buf7;
    @Value("${buf8}")
    public String buf8;
    @Value("${buf9}")
    public String buf9;
    @Value("${buf10}")
    public String buf10;
    @Value("${buf11}")
    public String buf11;
    @Value("${buf12}")
    public String buf12;
    @Value("${buf13}")
    public String buf13;

    @Override
    public String toString() {
        return "StackerConfig{" +
                "serverIp='" + serverIp + '\'' +
                ", serverPort='" + serverPort + '\'' +
                ", buf1='" + buf1 + '\'' +
                ", buf2='" + buf2 + '\'' +
                ", buf3='" + buf3 + '\'' +
                ", buf4='" + buf4 + '\'' +
                ", buf5='" + buf5 + '\'' +
                ", buf6='" + buf6 + '\'' +
                ", buf7='" + buf7 + '\'' +
                ", buf8='" + buf8 + '\'' +
                ", buf9='" + buf9 + '\'' +
                ", buf10='" + buf10 + '\'' +
                ", buf11='" + buf11 + '\'' +
                ", buf12='" + buf12 + '\'' +
                ", buf13='" + buf13 + '\'' +
                '}';
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getBuf1() {
        return buf1;
    }

    public void setBuf1(String buf1) {
        this.buf1 = buf1;
    }

    public String getBuf2() {
        return buf2;
    }

    public void setBuf2(String buf2) {
        this.buf2 = buf2;
    }

    public String getBuf3() {
        return buf3;
    }

    public void setBuf3(String buf3) {
        this.buf3 = buf3;
    }

    public String getBuf4() {
        return buf4;
    }

    public void setBuf4(String buf4) {
        this.buf4 = buf4;
    }

    public String getBuf5() {
        return buf5;
    }

    public void setBuf5(String buf5) {
        this.buf5 = buf5;
    }

    public String getBuf6() {
        return buf6;
    }

    public void setBuf6(String buf6) {
        this.buf6 = buf6;
    }

    public String getBuf7() {
        return buf7;
    }

    public void setBuf7(String buf7) {
        this.buf7 = buf7;
    }

    public String getBuf8() {
        return buf8;
    }

    public void setBuf8(String buf8) {
        this.buf8 = buf8;
    }

    public String getBuf9() {
        return buf9;
    }

    public void setBuf9(String buf9) {
        this.buf9 = buf9;
    }

    public String getBuf10() {
        return buf10;
    }

    public void setBuf10(String buf10) {
        this.buf10 = buf10;
    }

    public String getBuf11() {
        return buf11;
    }

    public void setBuf11(String buf11) {
        this.buf11 = buf11;
    }

    public String getBuf12() {
        return buf12;
    }

    public void setBuf12(String buf12) {
        this.buf12 = buf12;
    }

    public String getBuf13() {
        return buf13;
    }

    public void setBuf13(String buf13) {
        this.buf13 = buf13;
    }
}

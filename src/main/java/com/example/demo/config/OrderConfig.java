package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:config/msg/orderConfig.properties"})
@Component
public class OrderConfig {

    @Value("#{'${inbound}'.split(',')}")
    public List<String>   inbound;

    @Value("#{'${outbound}'.split(',')}")
    public String   outbound;


    public List<String> getInbound() {
        return inbound;
    }

    public void setInbound(List<String> inbound) {
        this.inbound = inbound;
    }


    public String getOutbound() {
        return outbound;
    }

    public void setOutbound(String outbound) {
        this.outbound = outbound;
    }
}

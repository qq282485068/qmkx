package com.zzgele.qmkx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class QmkxGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(QmkxGatewayApplication.class, args);
    }
}

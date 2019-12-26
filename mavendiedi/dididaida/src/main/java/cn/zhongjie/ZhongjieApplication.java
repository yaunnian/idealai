package cn.zhongjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZhongjieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhongjieApplication.class,args);
    }
}

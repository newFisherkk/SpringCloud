package org.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvideApp_8003 {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(DeptProvideApp_8003.class,args);
    }
}

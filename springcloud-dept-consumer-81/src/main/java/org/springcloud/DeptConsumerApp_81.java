package org.springcloud;

import org.ribbonruler.Myruler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
//在启动微服务的时候就能加载自定义的ribbon配置类
@RibbonClient(value = "SPRINGCLOUD-DEPARTMENT",configuration = Myruler.class)
public class DeptConsumerApp_81
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsumerApp_81.class,args);
        System.out.println( "Hello World!" );
    }
}

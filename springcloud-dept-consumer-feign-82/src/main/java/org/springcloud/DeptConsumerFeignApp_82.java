package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *  注意包名，api模块的包不要与provider里面的冲突
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"org.springcloud"} )
//@ComponentScan("org.springcloud.feign")
public class DeptConsumerFeignApp_82
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsumerFeignApp_82.class,args);
        System.out.println( "Hello World!" );
    }
}

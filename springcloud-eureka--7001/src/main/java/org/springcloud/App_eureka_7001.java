package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 需要添加@EnableEurekaServer注解标明
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class App_eureka_7001
{
    public static void main( String[] args )
    {
        SpringApplication.run(App_eureka_7001.class, args);
        System.out.println( "Hello World!" );
    }
}

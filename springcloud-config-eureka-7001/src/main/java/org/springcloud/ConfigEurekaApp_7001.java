package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApp_7001
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigEurekaApp_7001.class, args);
        System.out.println( "Hello World!" );
    }
}

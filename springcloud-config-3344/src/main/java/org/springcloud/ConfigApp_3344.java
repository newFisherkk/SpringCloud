package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp_3344
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApp_3344.class, args);
        System.out.println( "Hello World!" );
    }
}

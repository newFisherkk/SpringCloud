package org.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean{//boot没有applicationContext.xml配置，用bean配置
    @Bean
    @LoadBalanced//开启负载均衡,默认轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean//自定义负载均衡规则 七种规则
//    public IRule myRule(){
//        return new RandomRule();
//    }
}

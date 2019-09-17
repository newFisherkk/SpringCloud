package org.ribbonruler;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myruler  {

    @Bean
    public IRule myruler_zk(){
        return new RandomAcessRule_ZK();
    }
}

package org.springcloud.controller;

import org.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-DEPARTMENT";

    /**
     * restTemplate访问rest接口 xxxforObject
     * (url,requestMap,resopseBean.class)
     * rest请求地址，请求参数，http响应转换的对象
     * @param department
     * @return
     */

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept department){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",department,Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        System.out.println("hello");
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @GetMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }
}

package org.springcloud.feign;

import org.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept department){
        return this.service.add(department);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

}

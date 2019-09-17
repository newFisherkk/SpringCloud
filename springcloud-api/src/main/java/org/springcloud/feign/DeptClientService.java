package org.springcloud.feign;

import org.springcloud.entities.Dept;
import org.springcloud.hystrix.DepartmentClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 这里路径要他妈注意了是feign调用方法，然后方法调用上面注解的restURl，
 * 从而找到服务端的URI风格的调用方法
 */

//@FeignClient(value = "springcloud-department")
@FeignClient(value = "springcloud-department",fallbackFactory = DepartmentClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept department);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();
}

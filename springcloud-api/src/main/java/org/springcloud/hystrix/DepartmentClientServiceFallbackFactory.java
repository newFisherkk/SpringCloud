package org.springcloud.hystrix;

import feign.hystrix.FallbackFactory;
import org.springcloud.entities.Dept;
import org.springcloud.feign.DeptClientService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  //千万记得要加这个注解
public class DepartmentClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                Dept d=new Dept();
                d.setDeptno(id);
                d.setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                d.setDb_source("no this database in MySQL");
                return d;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}

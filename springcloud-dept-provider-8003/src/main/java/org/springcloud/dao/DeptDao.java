package org.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springcloud.entities.Dept;

import java.util.List;

//springboot+mybatis 接口必须要加注释
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

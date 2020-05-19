package com.atxyj.springcloud.dao;

import com.atxyj.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * className:DeptDao
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();


}

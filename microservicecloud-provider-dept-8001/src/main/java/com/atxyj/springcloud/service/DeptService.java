package com.atxyj.springcloud.service;

import com.atxyj.springcloud.entities.Dept;

import java.util.List;

/**
 * className:DeptService
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}

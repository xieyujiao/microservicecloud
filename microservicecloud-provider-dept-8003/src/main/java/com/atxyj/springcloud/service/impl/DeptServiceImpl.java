package com.atxyj.springcloud.service.impl;

import com.atxyj.springcloud.dao.DeptDao;
import com.atxyj.springcloud.entities.Dept;
import com.atxyj.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * className:DeptServiceImpl
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}

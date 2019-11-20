package com.ctrip.four.user.service.impl;

import com.ctrip.four.user.mapper.DeptMapper;
import com.ctrip.four.user.po.Dept;
import com.ctrip.four.user.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public class DeptServiceIml implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public PageInfo<Dept> findDeptByPage(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);//分页
        List<Dept> depts = deptMapper.selectAll();
        PageInfo<Dept> deptPageInfo = new PageInfo<>(depts);
        return deptPageInfo;
    }
}

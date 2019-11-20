package com.ctrip.four.user.service;

import com.ctrip.four.user.po.Dept;
import com.github.pagehelper.PageInfo;

public interface DeptService {

    public PageInfo<Dept> findDeptByPage(int page, int pageSize);

}

package com.ctrip.four.service.impl;

import com.ctrip.four.config.BaseMapper;
import com.ctrip.four.service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<M extends BaseMapper<T>,T> implements BaseService<T> {


    @Autowired
    private M m;

    @Override
    public PageInfo<T> findListByPage(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);//分页
        List<T> depts = m.selectAll();
        PageInfo<T> deptPageInfo = new PageInfo<>(depts);
        return deptPageInfo;
    }

    @Override
    public int deleteByPrimaryKey(Object o) {
        return m.deleteByPrimaryKey(o);
    }

    @Override
    public int delete(T t) {
        return m.delete(t);
    }

    @Override
    public int insert(T t) {
        return m.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return m.insertSelective(t);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return m.existsWithPrimaryKey(o);
    }

    @Override
    public List<T> selectAll() {
        return m.selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return m.selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(T t) {
        return m.selectCount(t);
    }

    @Override
    public List<T> select(T t) {
        return m.select(t);
    }

    @Override
    public T selectOne(T t) {
        return m.selectOne(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return m.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return m.updateByPrimaryKeySelective(t);
    }

    @Override
    public int deleteByExample(Object o) {
        return m.deleteByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return m.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return m.selectCountByExample(o);
    }

    @Override
    public T selectOneByExample(Object o) {
        return m.selectOneByExample(o);
    }

    @Override
    public int updateByExample(T t, Object o) {
        return m.updateByExample(t,o);
    }

    @Override
    public int updateByExampleSelective(T t, Object o) {
        return m.updateByExampleSelective(t,o);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return m.selectByExampleAndRowBounds(o,rowBounds);
    }

    @Override
    public List<T> selectByRowBounds(T t, RowBounds rowBounds) {
        return m.selectByRowBounds(t,rowBounds);
    }

    @Override
    public int insertList(List<? extends T> list) {
        return m.insertList(list);
    }

    @Override
    public int insertUseGeneratedKeys(T t) {
        return m.insertUseGeneratedKeys(t);
    }
}

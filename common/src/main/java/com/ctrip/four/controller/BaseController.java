package com.ctrip.four.controller;

import com.ctrip.four.config.BaseMapper;
import com.ctrip.four.service.BaseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class BaseController<S extends BaseService<T>,T> {

    @Autowired
    private S s;

    @RequestMapping(value = "/findListByPage",method = RequestMethod.GET)
    public PageInfo<T> findListByPage(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {

        PageInfo<T> listByPage = s.findListByPage(page, pageSize);
        return listByPage;
    }

    @RequestMapping(method = RequestMethod.POST)
    public T insert(T t){

        int insert = s.insert(t);
        if(insert>0){
            return t;
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public T update(T t){

        int update = s.updateByPrimaryKey(t);
        if(update>0){
            return t;
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Boolean delete(T t){

        int delete = s.delete(t);
        if(delete>0){
            return true;
        }
        return false;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<T> selectAll(){

        List<T> list = s.selectAll();

        return list;
    }

    @RequestMapping(value = "/selectOne",method = RequestMethod.POST)
    public T selectOne(T t){

        T one = s.selectOne(t);

        return one;
    }



}

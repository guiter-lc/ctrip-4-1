package com.ctrip.four.controller;

import com.ctrip.four.user.api.UserApi;
import com.ctrip.four.user.po.Dept;
import com.ctrip.four.user.po.UserInfo;
import com.github.pagehelper.PageInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    private static final Logger log = LogManager.getLogger(AdminController.class);
    @Autowired
    private UserApi userApi;
////
////    @RequestMapping(value = "/verify/{name}",method = RequestMethod.GET)
////    public UserInfo verifyByName(@PathVariable("name") String username){
////
////        UserInfo userInfo = userApi.verifyRemote(username);
////        return userInfo;
////    }
////    @RequestMapping(value = "/AllDept",method = RequestMethod.GET)
////    public PageInfo<Dept> findDeptByPage(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize){
////        PageInfo<Dept> deptByPage = userApi.findDeptByPage(page, pageSize);
////        return deptByPage;
////    }

    @RequestMapping(value = "user",method = RequestMethod.POST)
    public UserInfo insert(UserInfo userInfo){
        UserInfo insert = userApi.insert(userInfo);
        return insert;
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public UserInfo update(UserInfo userInfo){
        UserInfo update = userApi.update(userInfo);
        return update;
    }

    @RequestMapping(value = "user",method = RequestMethod.DELETE)
    public Boolean delete(UserInfo userInfo){
        Boolean delete = userApi.delete(userInfo);
        return delete;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<UserInfo> selectAll(){
        List<UserInfo> userInfos = userApi.selectAll();
        return userInfos;
    }

    @RequestMapping(value = "/user/selectOne",method = RequestMethod.GET)
    public UserInfo selectOne(UserInfo userInfo){
        UserInfo userInfo1 = userApi.selectOne(userInfo);
        return userInfo1;
    }

}

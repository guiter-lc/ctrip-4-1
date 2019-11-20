package com.ctrip.four.user.controller;


import com.ctrip.four.controller.BaseController;
import com.ctrip.four.user.po.Dept;
import com.ctrip.four.user.po.UserInfo;
import com.ctrip.four.user.service.DeptService;
import com.ctrip.four.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController extends BaseController<UserService,UserInfo> {
    private static final Logger log = LogManager.getLogger(UserController.class);
//    @Autowired
//    private DeptService deptService;
//
//    @RequestMapping(value = "/verify")
//    public UserInfo verify(@RequestParam("username") String username){
//        UserInfo useInfo = new UserInfo(1,username,"123");
//
//        return useInfo;
//    }
//
//    @RequestMapping(value = "/Alldept")
//    public PageInfo<Dept> findDeptByPage(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {
//
//        PageInfo<Dept> deptByPage = deptService.findDeptByPage(page, pageSize);
//        return deptByPage;
//    }

    @Override
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public UserInfo insert(@RequestBody UserInfo userInfo) {
        return super.insert(userInfo);
    }

    @Override
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public UserInfo update(@RequestBody UserInfo userInfo) {
        return super.update(userInfo);
    }

    @Override
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public Boolean delete(@RequestBody UserInfo userInfo) {
        return super.delete(userInfo);
    }

    @Override
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<UserInfo> selectAll() {
        log.info("-----------------------");
        return super.selectAll();
    }


    @RequestMapping(value = "/user/selectOne",method = RequestMethod.POST)
    public UserInfo selectOne(@RequestBody UserInfo userInfo) {
        log.info("--------------"+userInfo);
        return super.selectOne(userInfo);
    }
}

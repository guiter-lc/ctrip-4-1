package com.ctrip.four.user.api;

import com.ctrip.four.user.fallback.UserApiError;
import com.ctrip.four.user.po.Dept;
import com.ctrip.four.user.po.UserInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@FeignClient(value = "user-server",fallback = UserApiError.class)
public interface UserApi {

//    @RequestMapping(value = "/verify",method = RequestMethod.GET)
//    public UserInfo verifyRemote(@RequestParam("username") String username);
//
//    @RequestMapping(value = "/Alldept",method = RequestMethod.GET)
//    public PageInfo<Dept> findDeptByPage(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize);

    @RequestMapping(value = "user",method = RequestMethod.POST)
    public UserInfo insert(@RequestBody UserInfo userInfo);

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public UserInfo update(@RequestBody UserInfo userInfo);

    @RequestMapping(value = "user",method = RequestMethod.DELETE)
    public Boolean delete(@RequestBody UserInfo userInfo);

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<UserInfo> selectAll();

    @RequestMapping(value = "/user/selectOne",method = RequestMethod.POST)
    public UserInfo selectOne(@RequestBody UserInfo userInfo);

}

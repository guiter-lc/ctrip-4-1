package com.ctrip.four.user.fallback;


import com.ctrip.four.user.api.UserApi;
import com.ctrip.four.user.po.Dept;
import com.ctrip.four.user.po.UserInfo;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class UserApiError implements UserApi {

//    @Override
//    public UserInfo verifyRemote(String username) {
//        log.info("这里是熔断");
//        UserInfo userInfo = new UserInfo(0, username, "0");
//        return userInfo;
//    }
//

    @Override
    public PageInfo<UserInfo> findListByPage(int page, int pageSize) {
        log.info("进入熔断");
        return null;
    }
//    @Override
//    public PageInfo<Dept> findDeptByPage(int page, int pageSize) {
//
//        return null;
//    }


    @Override
    public UserInfo insert(UserInfo userInfo) {
        log.info("进入熔断");
        return null;
    }

    @Override
    public UserInfo update(UserInfo userInfo) {
        log.info("进入熔断");
        return null;
    }

    @Override
    public Boolean delete(UserInfo userInfo) {
        log.info("进入熔断");
        return null;
    }

    @Override
    public List<UserInfo> selectAll() {
        log.info("进入熔断");
        return null;
    }

    @Override
    public UserInfo selectOne(UserInfo userInfo) {
        log.info("进入熔断");
        return null;
    }
}

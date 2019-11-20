package com.ctrip.four.user.service.impl;

import com.ctrip.four.service.impl.BaseServiceImpl;
import com.ctrip.four.user.mapper.UserMapper;
import com.ctrip.four.user.po.UserInfo;
import com.ctrip.four.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, UserInfo> implements UserService {


}

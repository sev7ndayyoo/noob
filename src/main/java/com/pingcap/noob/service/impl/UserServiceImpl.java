package com.pingcap.noob.service.impl;

import com.pingcap.noob.dao.UserMapper;
import com.pingcap.noob.pojo.User;
import com.pingcap.noob.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User selectUserById(int id) {
        return userMapper.selectUserById(id);
    }

}

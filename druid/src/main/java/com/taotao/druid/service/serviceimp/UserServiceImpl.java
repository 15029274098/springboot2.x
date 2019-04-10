package com.taotao.druid.service.serviceimp;

import com.taotao.druid.bean.User;
import com.taotao.druid.mapper.UserMapper;
import com.taotao.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private   UserMapper userMapper;

    @Override
    public List<User> queryListUsers() {
        return userMapper.queryListUsers();
    }

    @Override
    public void deleteUserById(String userId) {
        userMapper.deleteUserById(userId);
    }
}

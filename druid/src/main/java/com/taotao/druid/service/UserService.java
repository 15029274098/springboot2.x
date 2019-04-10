package com.taotao.druid.service;

import com.taotao.druid.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 根据条件查询所有用户
     **/
    List<User> queryListUsers();
    /**
     * 根据条件删除用户
     * */
    void deleteUserById(String userId);
}

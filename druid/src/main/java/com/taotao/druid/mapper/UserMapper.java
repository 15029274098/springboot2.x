package com.taotao.druid.mapper;

import com.taotao.druid.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
    * 根据条件查询所有用户
    **/
    List<User> queryListUsers();
    /**
    * 根据条件删除用户
    * */
    void deleteUserById(@Param("userId") String userId);
}

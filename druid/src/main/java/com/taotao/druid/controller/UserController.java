package com.taotao.druid.controller;

import com.taotao.druid.bean.User;
import com.taotao.druid.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(description = "用户登录登出接口")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/queryListUsers")
    public List<User> queryListUsers(){
        List<User> list=new ArrayList<>();
        list=userService.queryListUsers();
        return list;
    }
    @GetMapping("/deleteUserById")
    @ApiOperation(value="展示首页信息")
    @ApiImplicitParam(name="userId", value="用户id", required = true)
    public void deleteUserById(@RequestParam(name="userId") String  userId){
        userService.deleteUserById(userId);
    }
}

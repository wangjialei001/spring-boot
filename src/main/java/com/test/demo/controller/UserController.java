package com.test.demo.controller;

import com.test.demo.dto.AddUser;
import com.test.demo.dto.User;
import com.test.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("用户接口")
public class UserController {
    @Autowired//自动装配
    private UserService userService;
    @Autowired
    private User user;
    @ApiOperation(value = "获取用户")
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public List<User> getUser() throws Exception{
        return userService.getUser();
    }
    @ApiOperation(value = "删除用户Id")
    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable int id) throws  Exception{
        userService.deleteUser(id);
        return "ok";
    }
    @ApiOperation(value = "新增用户")
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(@RequestBody AddUser adduser) throws Exception{
        user.setAge(adduser.getSex());
        user.setName(adduser.getName());
        user.setUsername(adduser.getUsername());
        user.setPassword(adduser.getPassword());
        user.setSex(adduser.getSex());
        userService.addUser(user);
        return "ok";
    }
}

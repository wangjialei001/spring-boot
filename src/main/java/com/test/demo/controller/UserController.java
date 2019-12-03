package com.test.demo.controller;

import com.test.demo.dto.User;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private User user;
    @RequestMapping("getUser")
    public List<User> getUser() throws Exception{
        return userService.getUser();
    }
    @RequestMapping("delete/{id}")
    public String deleteUser(@PathVariable int id) throws  Exception{
        userService.deleteUser(id);
        return "ok";
    }
    @RequestMapping("addUser")
    public String addUser() throws Exception{
        user.setAge("18");
        user.setName("阿花");
        userService.addUser(user);
        return "ok";
    }
}

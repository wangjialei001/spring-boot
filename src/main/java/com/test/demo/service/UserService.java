package com.test.demo.service;

import com.test.demo.dto.User;

import java.util.List;

public interface UserService {
    //显示所有用户
    public List<User> getUser() throws Exception;
    //根据Id删除用户
    public void deleteUser(int id) throws Exception;
    //新增用户
    public void addUser(User user) throws  Exception;
}

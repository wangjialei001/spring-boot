package com.test.demo.impl;

import com.test.demo.dao.UserMapper;
import com.test.demo.dto.User;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//用于标注业务层组件
public class UserServiceImpl implements UserService {
    @Autowired//
    private UserMapper userMapper;
    @Override
    public List<User> getUser() throws Exception {
        return userMapper.getUser();
    }

    @Override
    public void deleteUser(int id) throws Exception {
        userMapper.deleteUser(id);
    }

    @Override
    public void addUser(User user) throws Exception {
        userMapper.addUser(user);
    }
}

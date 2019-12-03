package com.test.demo.dao;

import com.test.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//Mapper注解之后这个接口在编译时会生成相应的实现类
public interface UserMapper {
    //获取用户名单
    public List<User> getUser() throws Exception;
    //根据Id删除用户
    public void deleteUser(int id) throws Exception;
    //新增用户
    public void addUser(User user) throws Exception;
}

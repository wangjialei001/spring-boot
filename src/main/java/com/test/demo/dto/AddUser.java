package com.test.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("添加用户")
public class AddUser {
    @ApiModelProperty("用户 name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @ApiModelProperty("用户 username")
    private String username;
    @ApiModelProperty("用户 password")
    private String password;
    @ApiModelProperty("用户 age")
    private Integer age;
    @ApiModelProperty("用户 sex")
    private String sex;
}

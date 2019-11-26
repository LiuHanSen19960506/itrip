package com.demo.dao;

import com.demo.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getUsers();
}

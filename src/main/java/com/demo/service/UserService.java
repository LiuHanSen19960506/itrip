package com.demo.service;

import com.demo.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getUsers();
}

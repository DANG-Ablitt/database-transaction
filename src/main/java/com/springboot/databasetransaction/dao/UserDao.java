package com.springboot.databasetransaction.dao;

import com.springboot.databasetransaction.pojo.User;

public interface UserDao {

    User getUser(Long id);
    int insertUser(User user);
}
package com.springboot.databasetransaction.service;


import com.springboot.databasetransaction.pojo.User;

public interface UserService {
	// 获取用户信息
	public User getUser(Long id);

	// 新增用户
	public int insertUser(User user);
}

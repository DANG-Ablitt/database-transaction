package com.springboot.databasetransaction.service.impl;

import com.springboot.databasetransaction.dao.UserDao;
import com.springboot.databasetransaction.pojo.User;
import com.springboot.databasetransaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao = null;

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
	public User getUser(Long id) {
		return userDao.getUser(id);
	}
}
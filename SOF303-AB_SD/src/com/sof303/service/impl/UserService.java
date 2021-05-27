package com.sof303.service.impl;

import java.util.List;

import com.sof303.dao.IUserDAO;
import com.sof303.dao.impl.UserDAO;
import com.sof303.model.UserModel;
import com.sof303.service.IUserService;

public class UserService implements IUserService{

	private IUserDAO userDAO = new UserDAO();
	
	@Override
	public List<UserModel> findAll() {
		return userDAO.findAll();
	}

	@Override
	public UserModel findOne(Integer id) {
		return userDAO.findOne(id);
	}
}

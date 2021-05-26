package com.sof303.service;

import java.util.List;

import com.sof303.model.UserModel;

public interface IUserService {
	
	List<UserModel> findAll();
	UserModel findOne(Integer id);
}

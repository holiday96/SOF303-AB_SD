package com.sof303.dao;

import java.util.List;

import com.sof303.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{
	
	List<UserModel> findAll();
	UserModel findOne(Integer id);
}

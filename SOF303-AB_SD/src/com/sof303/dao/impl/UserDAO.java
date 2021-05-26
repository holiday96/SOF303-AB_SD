package com.sof303.dao.impl;

import java.util.List;

import com.sof303.dao.IUserDAO;
import com.sof303.mapper.UserMapper;
import com.sof303.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public List<UserModel> findAll() {
		String sql = "SELECT * FROM USER";
		return query(sql, new UserMapper());
	}

	@Override
	public UserModel findOne(Integer id) {
		String sql = "SELECT * FROM USER WHERE USERID = ?";
		List<UserModel> model = query(sql, new UserMapper(), id);
		return model.isEmpty() ? null : model.get(0);
	}
}

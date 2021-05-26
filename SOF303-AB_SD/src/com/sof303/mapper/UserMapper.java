package com.sof303.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sof303.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs) {
		try {
			UserModel model = new UserModel();
			model.setId(rs.getInt("USERID"));
			model.setAccount(rs.getString("ACCOUNT"));
			model.setEmail(rs.getString("EMAIL"));
			model.setRole(rs.getString("ROLE"));
			model.setPassword(rs.getString("PASSWORD"));
			return model;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

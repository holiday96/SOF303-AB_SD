package com.sof303.util;

import java.util.List;

import com.sof303.model.UserModel;
import com.sof303.service.IUserService;
import com.sof303.service.impl.UserService;

public class ValidateUtil {

	private static IUserService userService = new UserService();

	static List<UserModel> listUser = userService.findAll();

	public static boolean checkLogin(String username, String password) {
		UserModel model = new UserModel();
		model.setAccount(username);
		model.setPassword(password);
		for (UserModel item : listUser) {
			if (item.getAccount().equals(model.getAccount())) {
				if (item.getPassword().equals(model.getPassword())) {
					AccountUtil.putValue(item);
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean checkForgotPassword(String username, String email) {
		UserModel model = new UserModel();
		model.setAccount(username);
		model.setEmail(email);
		for (UserModel item : listUser) {
			if (item.getAccount().equals(model.getAccount())) {
				if (item.getEmail().equals(model.getEmail())) {
					return true;
				}
			}
		}
		return false;
	}
}

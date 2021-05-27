package com.sof303.util;

import com.sof303.model.UserModel;

public class AccountUtil {

	private static UserModel user = null;
    
    public static void putValue(UserModel model) {
        user = model;
    }

    public static UserModel getValue() {
        return user;
    }
}

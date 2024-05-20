package com.mapconcept;

import java.util.HashMap;
import java.util.TreeMap;

import com.ExceptionHandling.MyException;

public class UserRole {

	private HashMap<String, String> getUserMap () {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller123");
		userMap.put("vendor", "vendor:vendor123");
		userMap.put("partner", "partner:partner123");
		userMap.put("user", "kowsi:kowsi123");
		return userMap;
	}

	private String getUserCredentials(String role) {
		if (getUserMap().containsKey(role)) {
			return getUserMap().get(role);
		} else {
			throw new MyException ("ROLE NOT FOUND");
		}
	}

	public void doLogin (String role) {
		String cred = getUserCredentials(role);
		String userName = cred.split(":")[0].trim();
		String password = cred.split(":")[1].trim();
		doLogin(userName, password);
	}

	public void doLogin (String userName, String password) {
		System.out.println("Logged in with : " + userName + " and " + password);
	}

	public static void main(String[] args) {
		UserRole user = new UserRole();
		user.doLogin("user");

		TreeMap<String, String> userMap = new TreeMap<String, String>();

		for (int i = 0; i < 10; i++) {
			userMap.put("ABC"+i, "testing"+i);
		}

		System.out.println(userMap);

	}

}

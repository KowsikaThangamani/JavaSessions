package com.encapsulation;

public class LoginPage {

	private String userName;
	private String password;


	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin (String userName) {
		if (isValidUserName(userName)) {
			System.out.println("username is : " + userName);
			System.out.println("password is : " + password);
			System.out.println("User is logged in");
		}
	}

	public boolean isValidUserName (String userName) {
		System.out.println("Checking the username is valid or not");
		if (userName.length() >= 3) {
			System.out.println("Valid username");
			return true;
		} else {
			System.out.println("Invalid username");
			return false;
		}
	}

}

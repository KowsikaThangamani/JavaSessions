package com.methods;

public class LoginPage {

	String userName;
	String password;

	public LoginPage() {

	}

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void doLogin() {
		System.out.println("username is : " + userName);
		System.out.println("password is : " + password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}

}

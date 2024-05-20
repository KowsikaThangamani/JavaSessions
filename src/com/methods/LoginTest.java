package com.methods;

public class LoginTest {

	public static void main(String[] args) {

		LoginPage obj = new LoginPage("sana", "sana123");

		obj.doLogin();

		LoginPage obj2 = new LoginPage();
		obj2.doLogin();

	}

}

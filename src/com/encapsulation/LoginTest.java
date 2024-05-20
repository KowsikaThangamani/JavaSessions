package com.encapsulation;

public class LoginTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage("sameer", "sameer123");

		lp.doLogin(lp.getUserName());

	}

}

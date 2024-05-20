package com.abstractclass;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LP ------ Default constructor");
	}

	public LoginPage(int i) {
		System.out.println("LP ------ parameterized constructor" + i);
	}

	@Override
	public void title() {
		System.out.println("LP ----- title");
	}

	@Override
	public void url() {
		System.out.println("LP ----- url");
	}

	@Override
	public void pageLoadingTime() {
		System.out.println("LP --- loading time 10 secs");
	}

	public void doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " and " + pwd);
	}

}

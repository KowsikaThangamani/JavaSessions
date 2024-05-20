package com.superkeyword;

public class WebPage extends Page {

	public int speed = 10;

	public WebPage() {
		System.out.println("WebPage -- Default constructor");
	}

	public WebPage(int i) {
		System.out.println("WebPage -- parameterized constructor " + i);
	}

	public void calculateTimeOut() {
		System.out.println("webpage -- calculate time out");
	}

	public final void logo() {
		System.out.println("Webpage -- logo");
	}

}

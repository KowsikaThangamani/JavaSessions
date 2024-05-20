package com.ExceptionHandling;

public class AppTest {

	public static void main (String[] args) {

		String browser = "ie";

		if (browser.equals("chrome")) {
			System.out.println("Launching chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("Launching chrome");
		} else if (browser.equals("safari")) {
			System.out.println("Launching chrome");
		} else {
			System.out.println("Please specify the right browser");
			throw new MyException("WRONGBROWSEREXCEPTION");
		}


	}

}

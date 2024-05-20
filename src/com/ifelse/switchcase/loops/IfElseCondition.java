package com.ifelse.switchcase.loops;

public class IfElseCondition {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		if (x>y) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		if(true) {
			System.out.println("Hi");
		}else {//else part is dead code
			System.out.println("Bye");
		}

		if(false) {//if part is dead code
			System.out.println("Hi");
		}else {
			System.out.println("Bye");
		}

		boolean flag = true;
		if(flag) {
			System.out.println("Hello");
		}else {
			System.out.println("World");
		}

		String browser = "chrome";
		browser = browser.trim().toLowerCase();

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Launching chrome");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Launching firefox");
		}
		else if (browser.equalsIgnoreCase("safari")) {
			System.out.println("Launching safari");
		}
		else {
			System.out.println("Please specify a valid browser");
		}


	}

}

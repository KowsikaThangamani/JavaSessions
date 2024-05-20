package com.ifelse.switchcase.loops;

public class SwitchCaseStatement {

//	Allowed Data Types : byte, short, int, char, string
//	Not allowed datatype : long, float, double, boolean
	public static void main(String[] args) {

		String browser = "chrome";
		browser = browser.trim().toLowerCase();

		switch (browser) {
		case "chrome" :
			System.out.println("Launching chrome");
			break;
		case "firefox" :
			System.out.println("Launching firefox");
			break;
		case "safari" :
			System.out.println("Launching safari");
			break;
		case "edge" :
			System.out.println("Launching edge");
			break;
		default :
			System.out.println("Please pass a valid browser");
			break;
		}

		char c = 'a';
		switch (c) {
		case 'a' :
			System.out.println("'" + c + "' is a vowel");
			break;
		case 'e' :
			System.out.println("'" + c + "' is a vowel");
			break;
		case 'i' :
			System.out.println("'" + c + "' is a vowel");
			break;
		case 'o' :
			System.out.println("'" + c + "' is a vowel");
			break;
		case 'u' :
			System.out.println("'" + c + "' is a vowel");
			break;
		default:
			System.out.println("'" + c + "' is a consonant");
			break;
		}
	}

}

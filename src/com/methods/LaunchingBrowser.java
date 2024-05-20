package com.methods;

public class LaunchingBrowser {


//	WAF : Function Name : launchBrowser (name)
//	input param : String browserName
//	return : true/false

	public boolean launchBrowser (String browserName) {
		System.out.println("Launching the browser : " + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome" :
			System.out.println("chrome is launched");
			return true;
		case "firefox" :
			System.out.println("firefox is launched");
			return true;
		case "edge" :
			System.out.println("edge is launched");
			return true;
		case "safari" :
			System.out.println("safari is launched");
			return true;
		default :
			System.out.println("Please pass the right browser name");
			return false;
		}

	}

	public static void main(String[] args) {

		LaunchingBrowser obj = new LaunchingBrowser();

		boolean isLaunched = obj.launchBrowser("chrome");
		if (isLaunched) {
			System.out.println("Browser launched");
		}
	}
}

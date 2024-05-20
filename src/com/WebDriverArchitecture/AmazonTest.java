package com.WebDriverArchitecture;

public class AmazonTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "ie";

		switch(browser) {
		case "chrome" :
			driver = new ChromeDriver();
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			break;
		case "safari" :
			driver = new SafariDriver();
			break;
		default :
			System.out.println("Please pass the right browser");
		}

		driver.get("https://www.amazon.com");

		String title = driver.getTitle();
		System.out.println("title is :" + title) ;
		if (title.equals("amazon")) {
			System.out.println("Title is passed");
		}
		else {
			System.out.println("Title is failed");
		}

		String url = driver.getURL();
		System.out.println(title + " : " + url);

		driver.findElement("logo");

		driver.sendKeys("username", "admin");
		driver.sendKeys("password", "admin123");

		driver.click("login button");

		driver.close();
	}

}

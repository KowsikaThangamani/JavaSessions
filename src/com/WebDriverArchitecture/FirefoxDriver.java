package com.WebDriverArchitecture;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Firefox is launched.");
	}

	@Override
	public void get(String url) {
		System.out.println("Launch url : " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("Getting title" );
		return "amazon";
	}

	@Override
	public String getURL() {
		return "www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("click on element url : " + eleName);
	}

	@Override
	public void sendKeys(String eleName, String value) {
		System.out.println("entering value in : " + eleName + " value : " + value);
	}

	@Override
	public void close() {
		System.out.println("browser is closed");
	}

	@Override
	public void findElement(String eleName) {
		System.out.println("find Element : " + eleName);
	}

	@Override
	public void findElements() {
		System.out.println("find Elements on the page");
	}

}

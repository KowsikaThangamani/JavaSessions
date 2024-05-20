package com.abstractclass;

public class AppTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.footers();
		lp.doLogin("admin", "admin123");
		Page.displayLogo();

		//If a parent class has a static method we can call that method with Child class name as well
		Page.displayLogo();

		//Page pg = new Page();

		//Top Casting : child class object can be referred by parant class reference variable
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadingTime();
		Page.displayLogo();
		pg.footers();




	}

}

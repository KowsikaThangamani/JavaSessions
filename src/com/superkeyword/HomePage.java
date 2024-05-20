package com.superkeyword;

//1. Used to call parent class constructor - should be the first statement
//2. Used to call/access parent class methods and variables
//3. Super and this cannot go together
//4. super keyword is also used to access parent class static method, but best practice is to access static methods by classname
//5. With super keyword we cannot access parent interface's variables and methods

public class HomePage extends WebPage {

	public int speed = 50;

	public HomePage() {
		super(10);
		System.out.println("HomePage -- Default constructor");
	}

	public HomePage(int i) {
		super(i+20);
		System.out.println("HomePage -- parameterized constructor " + i);
	}


	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();
		System.out.println("Homepage -- calculate time out");
		super.logo();
		System.out.println(super.speed);
		super.speed = 200;
		System.out.println(super.speed);
		System.out.println(speed);
	}

}

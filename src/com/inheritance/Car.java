package com.inheritance;

public class Car extends Vehicle {

	int maxSpeed = 100;

	static int price = 1000;

	final int minSpeed = 100;

	public void start () {
		System.out.println("Car ---- start");
	}

	public void stop () {
		System.out.println("Car ---- stop");
	}

	public void refuel () {
		System.out.println("Car ---- refuel");
	}

	@Override
	public void billing() {
		System.out.println("Car ---- billing");
	}

//	Static methods cannot be overridden if we create the smae method with exact signature it will be treated as individual method
//	And this concept is called Method hiding
	public static void carDisplay() {
		System.out.println("Car ---- display");
	}

//	final methods cannot be overriden - it will throw error, so it is not possible to have the same method in child class at all
	public final void carShow() {
		System.out.println("Car ---- show");
	}

	private void show() {
		System.out.println("Car ---- show car");
	}

}

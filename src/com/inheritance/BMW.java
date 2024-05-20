package com.inheritance;

public class BMW extends Car {

	int maxSpeed = 200;

	@Override
	public void start() {
		System.out.println("BMW ---- start");
	}

	public void autoParking () {
		System.out.println("BMW ---- auto parking");
	}

	@Override
	public void billing() {
		System.out.println("BMW - billing");
	}

//	public static void carDisplay() {
//		System.out.println("BMW ---- display");
//	}
//

}

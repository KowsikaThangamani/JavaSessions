package com.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	// can not create a function/method inside a function
	// functions are parallel to each other
	// but we can call a function from other function
	// NS functions - data members of the class

//	1. Function with no input and no return.
	//Input : No input
	//Return - void (can not return anything)

	public void test() {
		System.out.println("test method");
	}

//	2. Function with some input and no return
	public void getBill (int days) { // 1 parameter
		System.out.println("getting billing amount");
		int finalAmount = days*100;
		System.out.println(finalAmount);
	}

//	3. Function with some input and some return
	public int sum (int a , int b) {// 2 parameters
		System.out.println("Adding two numbers");
		int s = a+b;
		return s;
	}

//	4. Function with no input and some return
	public String getInfo () {
		System.out.println("getting information");
		String s = "Hello World";
		return s;
	}

	public boolean isAppExist() {
		return true;
	}

	// A function cannot have multiple returns
	// Return should be the last statement in a function
	public int testing () {
		System.out.println("testing is done");
		return 100;
	}

//	5. Function with blank return
	public void printName() {
		System.out.println("printing name");
		return;
	}

	public String[] getDevices() {
		System.out.println("getting Devices");
		String devices[] = {"Macbook Pro", "iPad", "iPhone4"};
		return devices;
	}

	public ArrayList<String> getUsersList() {
		System.out.println("Getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Shiva");
		userList.add("Ravi");
		userList.add("Leena");
		return userList;
	}

	public static void main(String[] args) {

		//To call a non static function we have to create object of the class
		FunctionsInJava obj = new FunctionsInJava();

		obj.test();

		obj.getBill(7);//Call by value --> The value that we are passing here is called argument

		int m = obj.sum(10, 7);
		System.out.println(m);

		int m1 = obj.sum(-10, 5);
		System.out.println(m1+9);

		String msg = obj.getInfo();
		System.out.println(msg);

		if (obj.isAppExist()) {
			System.out.println("login to app");
		}

		String devices[] = obj.getDevices();
		System.out.println(devices.length);
		System.out.println(Arrays.toString(devices));

		ArrayList<String> userList = obj.getUsersList();
		System.out.println(userList.get(0));
		System.out.println(userList.size());
		System.out.println(userList);
		userList.add("Naveen");

	}

}

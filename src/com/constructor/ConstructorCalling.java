package com.constructor;

//This keyword is used to call a constructor from another another constructor. But the constructor calling should be the 1st statement
//constructor can call a non static method directly without creating object
//Constructor can also call static method directly but the best practice is to call with class name
//If we want to call any constructor from a method we have to create object, bcoz constructor will be called only during object creation

public class ConstructorCalling {

	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

	public ConstructorCalling (String name, int age) {
		this("testing", 30, 10.0);
		this.name = name;
		this.age = age;
	}

	public ConstructorCalling(String name, int age, double salary) {
		System.out.println("Hi");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public ConstructorCalling(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public ConstructorCalling(String name, int age, double salary, boolean isActive, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;

		getInfo(); //constructor can call a non static method directly without creating object
		setInfo(); //Constructor can also call static method directly but the best practice is to call with class name

	}

	public void getInfo() {
		System.out.println("get info");
	}

	public static void setInfo() {
		System.out.println("set info");
	}

	public static void main(String[] args) {

		ConstructorCalling obj = new ConstructorCalling("Tom", 32);

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
	}

}

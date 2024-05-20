package com.classes.object;

public class User {

//	Class is a blueprint / prototype / template
//	instance of the class is called object
// 	Ex : Laptop is a class and name, size, color, price are its properties

//	String name = "sameer"; If we write like this, it implies that all the users name is sameer


//	Class Variables - data members of the class
	String name;
	int age;
	String city;
	String phoneNumber;
	double salary;
	boolean isActive;


	public static void main(String[] args) {

//		In order to access (NON STATIC) class variables or data members of the class we have to create the object using new keyword

		User u1 = new User();
		/*
		 * LHS = User u1
		 * RHS = new User()
		 * RHS is the object
		 * u1 is the object reference name
		 */

		//Inside the created object, Java will create a photocopy of the data members of the class and give it to the object
		//In our case photocopy of the 6 class variables will be given to the object

//		Assigning values to the class variables
		u1.name = "Vicky";
		u1.age = 35;
		u1.city = "Bangalore";
		u1.phoneNumber = "9035625456";
		u1.salary = 24.5;
		u1.isActive = true ;

		System.out.println(u1.name);
		System.out.println(u1.age);

//		We can create n number of objects
		User u2 = new User();
		System.out.println(u2.name);//null
		System.out.println(u2.age);//0
		System.out.println(u2.city);//null
		System.out.println(u2.phoneNumber);//null
		System.out.println(u2.salary);//0.0
		System.out.println(u2.isActive);//false

//		No reference object
		new User();

		// Here also photocopy of 6 class variables will be given to this object
		// but this object doesnot have any reference and hen ce it will later destroyed by garbage collector

		new User().name = "sameer";
		new User().age = 35;

		// The problem with above approach us that everytime we have to create a new object to assign any value to its properties
		// And this will cause serious memory issue
		// And we cannot retreive these values as well

//		Null Reference Objects
		User u3 = new User();
		u3 = null;
		u3.name = "Navy"; //NullPointerException





	}

}

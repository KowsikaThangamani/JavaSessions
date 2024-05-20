package com.classes.object;

public class Car {

	String name;
	String licenseNumber;
	double price;
	String color;
//	int wheels;//since wheels will always be fixed we can make it static - means it will be common for all the objects
	static int wheels = 4;

//	Static data members will be given to seperate memory allocation (not a part of heap and stack) called Common Memory Allocation (CMA)
//	CMA - Upto jdk 1.7 it was called Perm Generation (Static or fixed memory
//	From jdk 1.8 it was called Metaspace (Dynamic memory) if the allocated memory for cma is used up then it will automatically takes
//	some space from RAM

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "Audi";
		c1.licenseNumber = "12345";
		c1.price = 54.55;
		c1.color = "Black";
//		c1.wheels = 4; //Common value property

		Car c2 = new Car();
		c2.name = "BMW";
		c2.licenseNumber = "90878";
		c2.price = 44.76;
		c2.color = "White";
//		c2.wheels = 4;//Common value property

		Car c3 = new Car();
		c3.name = "Jaguar";
		c3.licenseNumber = "34567";
		c3.price = 84.55;
		c3.color = "Green";
//		c3.wheels = 4;//Common value property

//		How to access static variables

		//1. With class name --- Recommended
		System.out.println(c1.name + " - " + c1.licenseNumber + " - " + c1.price + " - " + c1.color + " - " + Car.wheels);

		//2. Directly
		System.out.println(c1.name + " - " + c1.licenseNumber + " - " + c1.price + " - " + c1.color + " - " + wheels);

		//3. With object reference name -- gives warning "Static field should be accessed in a static way"
		System.out.println(c1.name + " - " + c1.licenseNumber + " - " + c1.price + " - " + c1.color + " - " + Car.wheels);



	}

}

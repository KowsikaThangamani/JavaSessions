package com.constructor;

public class ConstructorConcept {

	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

//	1. Constructor name should be the same as the class name
//	2. Constructor cannot return anything - No void also
//	3. Constructor will not be static as well
//	4. Constructor overloading is possible
//	5. Constructor will be called while creating the object of the class
//	6. Constructor is used for initializing class variables with the constructors local variable, using "this" keyword
//	7. COnstructor is used to restrict unnecessary object creation depending on the usecase
//	8. Constructor is used for initialization purpose only not for business logic
//	9. Function can be called multiple times, but constructor will be called only when creating object

	//Class and constructors will be loaded by Class loaders into a special space in memory called auxillary space

	public ConstructorConcept() {//default constructor/no param constructor

	}

	public ConstructorConcept (int i) {//1 param

	}

	public ConstructorConcept (int i, String s) {//2 param

	}

//	Constructor's purpose is to restrict unwanted object creation. For ex for user registration functionality it will be unnecessary
//	to create object if we dont have any details to fill in the form. So to avoid that we create a constructor with required
//	fields as parameters so if and only if we have the values we can create the object now

	public ConstructorConcept (String name, int age) {
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept("Vicky", 32);
		//Here i am passing values to the constructors local variable and i want these values to be given to the
		//current class object's variable also ie.., i want to give "Vicky" to obj.name and "32" to obj.age

		//For this we will be using "This" keyword. this refers to current class object. so this.name refer to current class
		//object which is obj.name

		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}

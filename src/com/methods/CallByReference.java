package com.methods;

public class CallByReference {

	String name;
	int age;
	/*
	//If suppose we have to access the class variables inside this method we have to again create another object
	public static void getInfo() {
		CallByReference obj1 = new CallByReference();
		System.out.println(obj1.name);//null
		System.out.println(obj1.age);//0
		//bcoz the scope of the variable assigned in main method is just for that method only
	}*/

	//Call By Reference : We have created an object inside main method and assigned values to the class variables
	//what we can do is we can pass that reference name as an argument while calling the getInfo method
	//And create one parameter in getInfo() and the type of that parameter should be the class name
	//Now only one object is created, but it has 2 references (obj and t1)

	public static void getInfo(CallByReference t1) {
		System.out.println(t1.name);//prateek
		System.out.println(t1.age);//32

		t1.name = "Tom";
		t1.age = 35;

		System.out.println(t1.name);//tom
		System.out.println(t1.age);//35
	}

	public static void main(String[] args) {

		CallByReference obj = new CallByReference();
		obj.name = "prateek";
		obj.age = 32;

		System.out.println(obj.name);//prateek
		System.out.println(obj.age);//32

		getInfo(obj);

		System.out.println(obj.name);//tom
		System.out.println(obj.age);//35
	}

}

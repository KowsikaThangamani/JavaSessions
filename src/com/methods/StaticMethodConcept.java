package com.methods;

public class StaticMethodConcept {

	public static String name;
	public int age;

	public static void getInfo() {
		System.out.println("Getting some information");
	}

	public void senMail() {
		System.out.println("Send Email");
	}

	public static void main(String[] args) {

		StaticMethodConcept obj = new StaticMethodConcept();
		obj.senMail();
		System.out.println(obj.age);

//		How to access static methods and variables:

		//1. Using Class name
		StaticMethodConcept.getInfo();
		System.out.println(StaticMethodConcept.name);

		//2. With object reference name - with a warning "Static field should be accessed in a static way"
		StaticMethodConcept.getInfo();
		System.out.println(StaticMethodConcept.name);

		//3. directly
		System.out.println(name);
		getInfo();




	}

}

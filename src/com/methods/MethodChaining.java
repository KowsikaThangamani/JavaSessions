package com.methods;

public class MethodChaining {

	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
//		m1(); Cannot make static reference to a non static method
//		in order to call non static method from static method we have to create another objec. We have already created an object
//		in main method, but the scope of that object is only for the main method and outside of that method we cannot use that.
//		one solution for that is "Call By Reference" which we will see later
		MethodChaining obj1 = new MethodChaining();
		obj1.m1();
	}

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		t1();
	}

	public static void main(String[] args) {

		MethodChaining.t1();

		MethodChaining obj = new MethodChaining();
		obj.m1();

		//S-S - classname.methodname/directly
		//NS-NS - directly
		//S-NS - create object
		//NS-S - directly

		//S

	}

}

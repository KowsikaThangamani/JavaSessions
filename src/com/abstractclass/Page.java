package com.abstractclass;

public abstract class Page {

	public Page() {
		this(20);
		System.out.println("Page ---- default constructor");
	}

	public Page(int i) {
		System.out.println("Page ---- parameterized constructor" + i);
	}

//	1. We cannot create object of abstract class
//	2. In abstract class we can have abstract and non abstract methods as well
//	3. No default methods allowed in abstract class
//	4. 0 to 100% abstraction is possible
//	5. We can create constructor of abstract class which will be called while creating object of the child class

	public abstract void title();

	public abstract void url();

	public void pageLoadingTime() {
		System.out.println("page --- loading time 20 secs");
	}

	public static void displayLogo() {
		System.out.println("page --- display logo");
	}

	public final void footers() {
		System.out.println("page --- footers");
	}

}

package com.methods;

public class MainMethodOverloading {

//	Main method overloading is allowed in java
//	But JVM will always look for the main method with the exact signature PSVM(String[] args)

	public static void main(String[] args) {
		System.out.println("Hi");
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "JAVA");
	}

	public static void main (int i) {
		System.out.println("Hello" + i);
	}

	public static void main (int i, String s) {
		System.out.println("selenium " + s);
	}

}

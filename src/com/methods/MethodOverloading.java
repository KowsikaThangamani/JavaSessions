package com.methods;

public class MethodOverloading {

//	METHOD OVERLOADING : Two or more methods having the same name :
//	1. with different number of parameters and different type of parameters
//	2. With different sequence of parameters in case of different number of parameters
//	3. return type doesnt matter
//	4. Both static and non static methods can be overloaded
//	5. Method Overloading is also called compile time polymorphism because when we call these methods in main method while calling
//		itself compiler will take decision on which method to call based on the number and type of argument we are passing

	public void test() {

	}

	public int test (int i) {
		return 10;
	}

	public void test (int i, int j) {

	}

	public void test (int i, int j , String k) {

	}

	public void test (String i, int j, int k) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

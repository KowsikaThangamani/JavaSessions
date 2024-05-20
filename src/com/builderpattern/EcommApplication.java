package com.builderpattern;

public class EcommApplication {

//	If a class does not have any constructor, then while creating object of that class - JAVA will add a default hidden constructor
//	THis will happen internally in java

	public EcommApplication login (String un, String pwd) {
		System.out.println("login with : " + un + pwd);
		return this;
	}

	public EcommApplication login (String un, String pwd, String role) {
		System.out.println("login with : " + un + pwd + role);
		return this;
	}

	public EcommApplication search (String productName) {
		System.out.println("search : " + productName);
		return this;
	}

	public EcommApplication search (String productName, String color) {
		System.out.println("search : " + productName + color);
		return this;
	}

	public EcommApplication search (String productName, String color, int price) {
		System.out.println("search : " + productName + color + price);
		return this;
	}

	public EcommApplication addToCart (String productName) {
		System.out.println("Add to cart : " + productName);
		return this;
	}

	public EcommApplication payment(String upi) {
		System.out.println("payment : " + upi);
		return this;
	}

	public EcommApplication payment (String cc, int cvv) {
		System.out.println("payment : " + cc + cvv);
		return this;
	}

	public EcommApplication getOrderId () {
		System.out.println("order Id is : 12345");
		return this;
	}

	public EcommApplication logout() {
		System.out.println("Logging out");
		return this;
	}

}

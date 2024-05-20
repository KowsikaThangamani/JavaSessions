package com.methods;

public class MethodOverloadingExamples {
//	1. Login functionality in Ecommerce Application

	public void login (String un) {

	}

	public void login (String un, String pwd) {

	}

	public void login (String un, String pwd, int otp) {

	}

	public void login (String un, String pwd, String role) {

	}

//	2. Search functionality in Ecommerce Application

	public void search (String productName) {

	}

	public void search (String productName, String color) {

	}

	public void search (String productName, String color, int price) {

	}

	public void search (String productName, String color, String size) {

	}

//	3. Payment functionality in Ecommerce Application

	public void payment (String paymentMethod) {
		switch (paymentMethod) {
		case "upi" :
			break;
		case "paypal" :
			break;
		default :
			break;
		}
	}

	public void payment (String creditCard, int cvv, int otp) {

	}

//	4. Car booking functionality in Uber App

	public void booking (String st, String end) {

	}

	public void booking (String st, String end, String paymentMethod) {

	}

	public void booking (String st, String end, int numberOfPersons) {

	}

	public void booking (String st, String end, char gender) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

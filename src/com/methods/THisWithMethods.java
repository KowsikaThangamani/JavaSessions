package com.methods;

public class THisWithMethods {

	String name;
	String telephone;
	String password;

	public void userRegistration (String name, String telephone, String password) {
		System.out.println(name);
		System.out.println(telephone);
		System.out.println(password);

		this.name = name;
		this.telephone = telephone;
		this.password = password;
	}

	public void getInfo() {
		System.out.println(name + " - " + telephone + " - " + password);

	}
	public static void main(String[] args) {
		THisWithMethods obj = new THisWithMethods();

		obj.userRegistration("sana", "121212", "sana123");
		obj.getInfo();
	}

}

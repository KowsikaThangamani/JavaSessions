package com.builderpattern;

public class AppTest {

	public static void main(String[] args) {

		EcommApplication obj = new EcommApplication();

		obj.login("admin", "admin@123")
				.search("iPad")
					.addToCart("iPad")
						.payment("123 456 789 011")
							.getOrderId()
								.logout();

		System.out.println("***********************************************");

		obj.login("naveen", "naveen123")
				.search("iPhone")
					.logout();

		System.out.println("***********************************************");

		obj.login("vendor", "vendor@123")
				.search("Samsung phone")
					.addToCart("Samsung phone")
						.payment("123 456 789 011")
							.getOrderId()
								.logout();

		System.out.println("***********************************************");

		obj.login("naveen", "naveen123")
			.logout();

		System.out.println("***********************************************");

		obj.login("naveen", "naveen123");

		System.out.println("***********************************************");

		obj.logout();

	}

}

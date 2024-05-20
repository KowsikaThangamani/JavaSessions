package com.arrays;

public class StringArray {

	public static void main(String[] args) {

		String product[] = new String[3];

		product[0] = "Macbook Pro";
		product[1] = "Macbook Air";
		product[2] = "iPad";

		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i]);
			if(product[i].equals("Macbook Pro")) {
				System.out.println("Out of Stock");
			}
		}

		for (int i = product.length-1; i>= 0; i--) {
			System.out.println(product[i]);
		}

	}

}

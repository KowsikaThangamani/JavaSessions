package com.arrayliterals;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {

		int i[] = {10, 20, 30, 40, 50, 1};
		System.out.println(i[0]);
		System.out.println(i.length);
		System.out.println(i[i.length-1]);

		char ch[] = {'a', 'e', 'i', 'o', 'u'};
		for (int j = 0; j < ch.length; j++) {
			System.out.println(ch[j]);
		}

		String productArray[] = {"iPad", "Samsung", "Oneplus"};
		System.out.println(Arrays.toString(productArray));

		Object data[] = {"Nakul", 30, 12.33, 'M', true};
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));

		double d[] = {1.1, 3.4, 9.8, 12.33};
		for(double e : d) {
			System.out.println(e);
		}

	}

}

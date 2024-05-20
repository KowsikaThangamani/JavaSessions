package com.arrays;

import java.util.Arrays;

public class IntArray {

	public static void main(String[] args) {

		int i[] = new int[4];
		System.out.println(Arrays.toString(i));
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
//		i[4] = 50; AIOB

		System.out.println(i[0]);
//		System.out.println(i[4]);AIOB
//		System.out.println(i[-1]);AIOB
		System.out.println(i.length);
		System.out.println(i);
		System.out.println(Arrays.toString(i));

		for (int j = 0; j < i.length ; j++) {
			System.out.println(i[j]);
		}

	}

}

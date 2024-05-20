package com.arrays;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {

		Object empData[] = new Object[5];

		empData[0] = "Vignesh";
		empData[1] = 30;
		empData[2] = 25.55;
		empData[3] = 'M';
		empData[4] = true;

		System.out.println(Arrays.toString(empData));

	}

}

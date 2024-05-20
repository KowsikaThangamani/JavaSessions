package com.arrays;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {

		char ch[] = new char[3];
		System.out.println(Arrays.toString(ch));

		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 98;
		System.out.println(ch[3]);

	}

}

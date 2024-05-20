package com.arraylist;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(120);
		ar.add(150);
		ar.add(240);
		ar.add(0, 100);
		ar.add(3, 180);
		ar.add(4, 210);

		System.out.println(ar);
	}

}

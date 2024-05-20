package com.arraylist;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<>();

		ar.add("Arunee");
		ar.add("kowsi");
		ar.add("Aadhini");
		ar.add("Vicky");

		System.out.println(ar.get(0));
		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(ar.remove(0));
		System.out.println(ar.get(0));

	}

}

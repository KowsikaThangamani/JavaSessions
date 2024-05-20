package com.arraylist;

import java.util.ArrayList;

public class ObjectArrayList {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add(0, "Vignesh");
		ar.add("Kowsi");
		ar.add(1, "Arunee");
		ar.add(2, "Aadhini");

		System.out.println(ar);
	}

}

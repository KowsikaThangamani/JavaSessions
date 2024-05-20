package com.arraylist;

import java.util.ArrayList;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add("Vignesh");
		ar.add(35);
		ar.add(25.55);
		ar.add('M');
		ar.add(true);

		System.out.println(ar.size());
		System.out.println(ar);

	}

}

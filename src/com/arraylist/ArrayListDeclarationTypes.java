package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDeclarationTypes {

	public static void main(String[] args) {

//		1. Declaring a normal arraylist
		ArrayList<String> ar = new ArrayList<String> ();

//		2. Specifying initial capacity (VC)
		ArrayList<String> arr = new ArrayList<String> (10);

//		3. initializing ArrayList with some elements
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("Chrome, Firefox, Safari, Edge"));

//		4. Using double brace initialization
		ArrayList<String> osList = new ArrayList <String>() { {
			add("Mac");
			add("Linux");
			add("Windows");
		} };

	}

}

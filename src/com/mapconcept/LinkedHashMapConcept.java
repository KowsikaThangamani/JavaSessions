package com.mapconcept;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {

		LinkedHashMap<String, String> empData = new LinkedHashMap<String, String>();

		//Multiple keys can have the same value but we cannot have more than one key with the same name. Key is unique.
		empData.put("Tom" , "SDET1");
		empData.put("Peter" , "SDET2");
		empData.put("Ravi" , "SDET3");
		empData.put("Lisa" , "SDET4");
		empData.put("Naveen" , "SDET4");
		empData.put(null, "null");

		System.out.println(empData.get("Naveen"));
		System.out.println(empData.size());
		empData.remove("Naveen");
		empData.remove("Ravi", "SDET5");
		System.out.println(empData);

		if (empData.containsKey("Naveen")) {
			System.out.println("Data not removed");
		} else {
			System.out.println("Removed the data");
		}


	}

}

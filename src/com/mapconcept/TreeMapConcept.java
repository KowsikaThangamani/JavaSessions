package com.mapconcept;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());

		//Multiple keys can have the same value but we cannot have more than one key with the same name. Key is unique.
		empData.put("Tom" , "SDET1");
		empData.put("Peter" , "SDET2");
		empData.put("Ravi" , "SDET3");
		empData.put("Lisa" , "SDET4");
		empData.put("Naveen" , "SDET4");
//		empData.put(null, "null");
		empData.put("@kowsi", "SDET5");
		empData.put("123vicky", "null");
		empData.put("arunee", null);

//		System.out.println(empData.get("Naveen"));
//		System.out.println(empData.size());
//		empData.remove("Naveen");
//		empData.remove("Ravi", "SDET5");
		System.out.println(empData);

//		for (Map.Entry<String, String> e : empData.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
//
//		empData.forEach((k,v) -> System.out.println(k + " : " + v));

	}

}

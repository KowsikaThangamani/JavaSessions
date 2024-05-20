package com.mapconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

//	Non order based collection

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Tom", 12345);
		hm.put("lisa", 345);

		System.out.println(hm.get("Tom"));
		System.out.println(hm.size());

		hm.put("lisa", 300);
		System.out.println(hm.get("lisa"));

		HashMap<String, String> empData = new HashMap<String, String>();

		//Multiple keys can have the same value but we cannot have more than one key with the same name. Key is unique.
		empData.put("Tom" , "SDET1");
		empData.put("Peter" , "SDET2");
		empData.put("Ravi" , "SDET3");
		empData.put("Lisa" , "SDET4");
		empData.put("Naveen" , "SDET4");
//		empData.put(null , "SDETManager");
//		empData.put(null , "SDETDirector");
//		empData.put(null , null);
//		empData.put("Prateek" , null);
//		empData.put("Usha" , null);

		System.out.println(empData.get(null));
		System.out.println(empData);

		HashMap<String, ArrayList<String>> empDetails = new HashMap<String, ArrayList<String>>();
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Pune");
		emp.add("Delhi");

		empDetails.put("Tom", emp);
		System.out.println(empDetails);

		for (Map.Entry<String, String> e : empData.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		empData.forEach((k,v) -> System.out.println(k + " : " + v));
	}

}

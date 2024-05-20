package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 50, 70, 40, 5, 15));

		System.out.println(numList);

		Collections.shuffle(numList);
		System.out.println(numList);

		Collections.sort(numList);
		System.out.println(numList);

		Collections.swap(numList, 5, 1);
		System.out.println(numList);

		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("Mac", "Windows", "Linux", "Unix"));
		System.out.println(osList);

		Collections.sort(osList);

		System.out.println(osList);

		List<Object> testList = Collections.emptyList();
		System.out.println(testList.size());
//		testList.add("Selenium");UnsupportedOperationException
//		System.out.println(testList.size());

	}

}

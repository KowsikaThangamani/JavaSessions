package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> browserList = new ArrayList<String>();

//	1. To add elements in the Array List
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("IE");

//	2. To add elements at specified index
		browserList.add(1, "Edge");
		// browserList.add(5, "safari");IOB have to update in sequential order
		browserList.add(2, "kowsi");

//	3. To update a value at specified index
		browserList.set(2, "safari");

//	4. TO remove an element
		browserList.remove(4);

//	5. To get the size of the arrayList
		System.out.println(browserList.size());

//	6. To print the entire ArrayList
		System.out.println(browserList);

//	7. To retrieve a specific element
		System.out.println(browserList.get(2));

//	8. To find index number of any Arraylist values
		System.out.println(browserList.indexOf("safari"));
		System.out.println(browserList.indexOf("Arunee"));

		if (browserList.indexOf("safari") == -1) {
			System.out.println("Wrong Browser");
		}

		ArrayList<String> osList = new ArrayList<String>(Arrays.asList("Mac", "Windows", "Linux"));

//	9. To merge two arrayList
		browserList.addAll(osList);
		System.out.println(browserList);

//	10. To remove any one of the ArrayList
		browserList.removeAll(osList);
		System.out.println(browserList);

//	11. .contains method returns boolean value
		if (osList.contains("unix")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

//	12. .containsAll method
		ArrayList<String> subList = new ArrayList<String> (Arrays.asList("Windows", "Mac"));
		System.out.println(osList.containsAll(subList));

//	13. .subList method
		List<String> baseList = browserList.subList(2, 4);
		System.out.println(browserList);
		System.out.println(baseList);

//	14. .clear method
		baseList.clear();
		System.out.println(baseList);

//	15. trimToSize method
		browserList.trimToSize();

	}

}

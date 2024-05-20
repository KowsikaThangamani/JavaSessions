package com.stringmanipulation;

public class StringvsStringBuildervsStringBuffer {

	public static void main(String[] args) {

//	1. String - immutable
		String str = "Hello";
		str.concat("Selenium");
		System.out.println(str);

//	2. String Builder - Mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("JAVA");
		System.out.println(sb);

//	3. String Buffer
		StringBuffer sbr = new StringBuffer("Hello");
		sbr.append("Kowsika");
		System.out.println(sbr);

	}

}

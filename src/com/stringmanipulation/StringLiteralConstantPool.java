package com.stringmanipulation;

public class StringLiteralConstantPool {

	public static void main(String[] args) {

		String tr = "Hello";
		tr.concat("selenium");
		System.out.println(tr);

		tr = tr.concat("Java");
		System.out.println(tr);

		String s1 = "Hello";
		String s2 = "Hello";

		String s3 = new String("World");

		String s4 = "World";
		String s5 = "Hello";

		String s6 = new String("selenium");
		String s7 = "selenium";
		String s8 = new String("selenium");

		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s6==s8);

		System.out.println(s3.equals(s4));
		System.out.println(s6.equals(s8));



	}

}

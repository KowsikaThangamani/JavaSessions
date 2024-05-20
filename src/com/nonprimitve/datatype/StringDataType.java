package com.nonprimitve.datatype;

public class StringDataType {
	/*
	 * String is a sequence of characters enclosed within double quotes (For Ex:
	 * "Hello Selenium") We can also store numerical values in String enclosed
	 * within "", but we cannot perform any arithmetic operation on these values
	 */

	public static void main(String[] args) {

		String x = "Hello";
		String y = "Selenium";
		int a = 100;
		int b = 200;
		String s = "100";

		System.out.println(x+y);//HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(s+a);//100100

		char c = 'a';
		System.out.println(x+c+'b');//Helloab
		System.out.println('a'+'b'+x);//195Hello
		System.out.println('a'+'b'+100+x);//295Hello
		System.out.println('0'+'a'+'A'+x);//210Hello
		System.out.println(x+'0'+'a'+'A');//Hello0aA
		System.out.println('0'+'a'+'A'+x+'0');//210Hello0
		System.out.println(1*1*10/2+x);//5Hello

		System.out.println("Hi, My name is \"Kowsika\"");


	}

}

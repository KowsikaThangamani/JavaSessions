package com.primitive.datatype;

public class CharDataType {

	//size = 4 bytes (16 bits)

	public static void main(String[] args) {

		char c = 97;
		char c1 = 'a';
		char c2 = '9';
		char c3 = 'Z';

		//a-z = 97 to 122
		//A-Z = 65 to 90
		//0-9 = 48 to 57
		System.out.println(c);
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((byte)c);
		System.out.println((byte)'$');

//		'+' between two char = addition of two ASCII values
		System.out.println(c1+c2);

//		'+' between an int and char = addition of the number to ASCII value
		System.out.println(100+c1);

//		'+' between two int = addition of two numbers
		System.out.println(100+100);

//		'+' between two String = concatenation
		System.out.println("Hello"+" Java");

//		'+' between a string and a char = concatenation
		System.out.println("Hello" + c1);
		System.out.println(c1+""+c3);

	}

}

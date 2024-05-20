package com.typecasting;

public class TypeCasting {

//	byte, short, char, int, long, float, double
//	smaller to bigger - Widening
//	bigger to smaller - Narrowing

	public static void main(String[] args) {

//		Widening:
		byte t = 10;
		int k = t;
		System.out.println(k);

//		Narrowing:
		int p = 150;
		byte q = (byte)p;
		System.out.println(q);//150-256

//		Widening:
		long l = p;
		System.out.println(l);

		long l1 = 1000;
		float f1 = l1;
		System.out.println(f1);

//		Narrowing:
		float f2 = 12.33f;
		long l2 = (long)f2;
		System.out.println(l2);

		int i = (int)f2;
		System.out.println(i);

		float f3 = 800.85f;
		byte b3 = (byte)f3;
		System.out.println(b3);//800-256 ---> 544-256 --->288-256 ---> 32

		int ch = 'a';
		byte bh = 'a';

		char c1 = 'b';
		int a1 = c1;
		System.out.println(a1);

		int v = 97;
		char v1 = (char)v;
		System.out.println(v1);
	}

}

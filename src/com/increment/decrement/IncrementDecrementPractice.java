package com.increment.decrement;

public class IncrementDecrementPractice {

	public static void main(String[] args) {

		int m = 5;
		int k = m++ + ++m;//5+7
		System.out.println(m);//7
		System.out.println(k);//12

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;//11+22+11+22+13+24
		System.out.println(a);//13
		System.out.println(b);//24
		System.out.println(c);//103
		/*
		int i = 0;
		int j = i++ - --i + ++i - i--;//0-0+1-1
		System.out.println(i);
		System.out.println(j);
		*/
		int i = 19, j = 29, l = 0;
		int n = i-- - j-- - l--;//19-29-0
		System.out.println(i);//18
		System.out.println(j);//28
		System.out.println(l);//-1
		System.out.println(n);//-10

		float f1 = 1.1f;
		float f2 = f1++;
		System.out.println(f1);//2.1
		System.out.println(f2);//1.1

		char ch = 'a';
		System.out.println(++ch);//b
		System.out.println((int)ch);//98

		int d = 'a';
		System.out.println(++d);//98
		System.out.println((char)d);//b

	}

}

package com.increment.decrement;

public class PostIncrement {

	public static void main(String[] args) {

		int a = 1;
		int b = a++;
		System.out.println(b);//1
		System.out.println(a);//2

		int g = -98;
		int h = g++;
		System.out.println(g);//-97
		System.out.println(h);//-98

		int k = -999;
		System.out.println(k++);//-999
		System.out.println(k);//-998

	}

}

package com.increment.decrement;

public class PreIncrement {

	public static void main(String[] args) {

		int x = 1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2

		int p = -99;
		int q = ++p;
		System.out.println(p);//-98
		System.out.println(q);//-98

		int t = 10;
		System.out.println(++t);//11
		System.out.println(t);//11

	}

}

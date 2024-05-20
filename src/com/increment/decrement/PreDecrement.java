package com.increment.decrement;

public class PreDecrement {

	public static void main(String[] args) {

		int m = 2;
		int n = --m;
		System.out.println(m);//1
		System.out.println(n);//1

		int t1 = -999;
		int t2 = --t1;
		System.out.println(t1);//-1000
		System.out.println(t2);//-1000

	}

}

package com.ifelse.switchcase.loops;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p%5 == 0) {
				System.out.println("Hi");
				break;
			}
		}

		int total = 60;
		while (total >= 50 && total <= 100) {
			System.out.println("Hi");
			--total;
		}

//		INFINITE LOOPS:
		int j = 1;
		while (j <= 10) {
			System.out.println(j);
		}

		boolean flag = true;
		while (flag) {
			System.out.println("Hi");
		}

		int k = 1;
		while (k >= 1) {
			System.out.println(k);
			k++;
		}

	}

}

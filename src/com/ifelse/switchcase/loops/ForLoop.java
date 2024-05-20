package com.ifelse.switchcase.loops;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1 ; i <= 10; i++) {
			System.out.println(i);
		}

		int i = 1;
		for (;i<=10;) {
			System.out.println("Hi");
			i++;
		}

		for (float f = 1.0f; f <=5.5; f++) {
			System.out.println(f);
		}

		for (float f = 1.0f; f <=5.5;) {
			System.out.println(f);
			f = f+2.0f;
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

		for (char ch = 97; ch <= 122; ch++) {
			System.out.println(ch);
		}

		for (int j = 2; j <= 100; j+=2) {
			System.out.println(j);
		}

	}

}

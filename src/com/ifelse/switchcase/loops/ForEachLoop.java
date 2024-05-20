package com.ifelse.switchcase.loops;

public class ForEachLoop {

	public static void main(String[] args) {

		int i[] = {10, 20, 30, 40, 50};
		for(int e : i) {
			System.out.println(e);
		}

//		Printing in reverse order
		int count = i.length-1;
		for (int e : i) {
			e = count;
			System.out.println(i[e]);
			count--;
		}

//	Print Array values along with index
		int num = 0;
		for (int e : i) {
			System.out.println(num + " - " + e);
			num++;
		}

	}

}

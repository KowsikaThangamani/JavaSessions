package com.ExceptionHandling;

public class FinallyBlockQuestion {

	public static int getMarks (String studentName) {
		System.out.println("Getting marks for : " + studentName);
		switch (studentName) {
		case "rahul" :
			try {
				int i = 9/3;
//				System.exit(1);//Shut down the JVM
				return 80;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming!!!!!");
				return 70;
			} finally {
				System.out.println("Finally Block");
				try {
					int l = 9/0;
				} catch (ArithmeticException e) {
					System.out.println("Finally block exception");
					return 6;
				} finally {
					System.out.println("Finally inside finally");
					return 2;
				}
			}
		case "om" :
			try {
				int p = 9/0;
			} catch (ArithmeticException e) {
				return 5;
			} finally {
				return 8;
			}
			//return 95;
		case "naveen" :
			return 10;
		default :
			System.out.println("Please pass the right student name.....");
			return -1;
		}
	}

	public static void main(String[] args) {

		int m = FinallyBlockQuestion.getMarks("rahul");
		System.out.println(m);

	}

}

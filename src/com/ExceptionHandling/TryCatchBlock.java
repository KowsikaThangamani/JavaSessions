package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Thread.sleep(5000);//Interrupted Exception - checked exception - compile time exception
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

		//**********************************************************************************************************************

		try {
			FileInputStream file = new FileInputStream("/user/test.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//**********************************************************************************************************************

		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "naveen";//Runtime exception - unchecked exception
			int i = 9/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming!!!!");
		} catch (Exception e) {
			System.out.println("Exception is coming");
		}

		//**********************************************************************************************************************

		System.out.println("bye!!!!!");

	}

}

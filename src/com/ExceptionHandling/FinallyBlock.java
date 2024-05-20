package com.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		try {
			int i = 9/0;
		}  catch (ArithmeticException e) {
			System.out.println("AE is coming!!!!");
		} finally {
			System.out.println("Entering finally block");
		}

	}

}

//When to use finally block?
//
//		1. Make connection with DB - username/pwd
//		2. Hit the SQL : Select * from Employee
//
//		try - catch
//		3. String result = get the results from DB / table
//
//		finally
//		4. close the db connection
//
//		5. use the results in the script
//
//		6. continue code
//
//		7. Logout

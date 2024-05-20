package com.methods;

public class GetStudentMarks {

//	WAF : Function Name : getStudentMarks
//	input param : studentName (String)
//	return : marks (int)

//	1. IF....ELSE... with multiple returns
	public int getStudentMarks (String studentName) {
		System.out.println("Getting marks for the student : " + studentName);
		if (studentName.equalsIgnoreCase("Devika")) {
			return 80;
		}
		else if (studentName.equalsIgnoreCase("Ravi")) {
			return 90;
		}
		else if (studentName.equalsIgnoreCase("naveen")) {
			return 40;
		}
		else {
			return -1;
		}
	}

//	2. IF...ELSE... with one return
	public int getStuMarks (String studentName) {
		System.out.println("Getting marks for the student : " + studentName);

		int marks = -1;
		if (studentName.equalsIgnoreCase("Devika")) {
			marks = 80;
		}
		else if (studentName.equalsIgnoreCase("Ravi")) {
			marks = 90;
		}
		else if (studentName.equalsIgnoreCase("naveen")) {
			marks = 40;
		}
		else {
			System.out.println("Please provide the correct name");
		}

		return marks;
	}

//	3. SWITCH CASE with multiple return
	public int getMarks (String studentName) {
		System.out.println("Getting marks for the student :  " + studentName);

		switch (studentName.trim().toLowerCase()) {
		case "devika" :
			return 80;
		case "ravi" :
			return 90;
		case "naveen" :
			return 10;
		default :
			System.out.println("Please provide the right name");
			return -1;
		}
	}

//	4. SWITCH CASE with one return
	public int gettingMarks (String studentName) {
		System.out.println("Getting marks for the student :  " + studentName);

		int marks = -1;
		switch (studentName.trim().toLowerCase()) {
		case "devika" :
			marks = 80;
		case "ravi" :
			marks = 90;
		case "naveen" :
			marks = 10;
		default :
			System.out.println("Please provide the right name");
		}
		return marks;
	}

	public static void main(String[] args) {

		GetStudentMarks obj = new GetStudentMarks();

		int m1 = obj.getStudentMarks("vicky");
		if (m1 == -1) {
			System.out.println("Student not available");
		} else {
			System.out.println("Printing the marksheet");
		}

	}

}

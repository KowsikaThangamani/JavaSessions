package com.stringmanipulation;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCOncept {

	public static void main(String[] args) {

		String str = "hello This is my java code and i am so happy i am expert i am also sad";

//	1. Length method
		System.out.println(str.length());

//	2. charAt
		System.out.println(str.charAt(7));
		//System.out.println(str.charAt(90)); String Index out of bound

//	3. IndexOf
		System.out.println(str.indexOf('x'));
		System.out.println(str.indexOf('i'));//First occurence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//Second occurence of i
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));//third occurence of i
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1));//fourth occurence of i
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1)+1)+1));

		System.out.println(str.indexOf("sad"));
		System.out.println(str.indexOf("python"));

		if (str.indexOf("python") == -1){
			System.out.println("Correct message");
		} else {
			System.out.println("Incorrect message");
		}

//	4. trim
		String s = "	hello	world	";
		System.out.println(s.trim());

//	5. replace
		String dob = "01-01-1991";
		String myStr = "    hello    world    ";
		System.out.println(dob.replaceAll("-", "/"));
		System.out.println(myStr.replaceAll(" ", ""));

		String mg = "Java Python Ruby";
		System.out.println(mg.replace(" ", "||"));
		System.out.println(mg.replace("Java", "JS"));

//	6. Split
		String pop = "javascript;java;python;ruby";
		String p[] = pop.split(";");
		System.out.println(Arrays.toString(p));

		String rest = "xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";
		String rs[] = rest.split("xX");
		System.out.println(rs[1]);
		System.out.println(rs[0].length());

		String empData = "pallavi;sharma;30;pune;India;908767687587";
		String empData1 = empData.replace(";", "");
		System.out.println(empData1);
		String ed[] = empData1.split("\\.");
		System.out.println(ed[0]);

//	7.	To LowerCase And To uppercase :
		String name = "Test Automation Labs";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		 String domain = "    hello    selenium    ";
	     String dom = domain.replaceAll("\\s+", "");
	     System.out.println(dom);

	     String t1 = "your order id is 12345";
	     String orderId = t1.replaceAll("\\D+", "");
	     System.out.println(orderId);

	     String t2 = "your user id is 9090 and order id is 12345";

	     Pattern pattern = Pattern.compile("\\d+");
	     Matcher matcher = pattern.matcher(t2);

//	     while (matcher.find()) {
//	    	 System.out.println(matcher.group());
//	     }
//
	     String userId = null;
	     String oId = null;

	     if(matcher.find()) {
	    	 userId = matcher.group();
	     }

	     if(matcher.find()) {
	    	 oId = matcher.group();
	     }

	     System.out.println("User Id is : " + userId);
	     System.out.println("Order Id is : " + oId);

	     String tr = "Hello!! this is my value .$123333*";
	     String newTr = tr.replaceAll("[^a-zA-Z0-9\\s]", "");
	     System.out.println(newTr);

	}

}

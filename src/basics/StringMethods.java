package basics;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Automation Testing";
		System.out.println(name);
		System.out.println(name.length());
		/*
		 * length(); subString charAt indexOf trim split replace replaceAll equal
		 * eqalsIgnoreCase compareTo toUppercase toLowercase
		 * 
		 */
		System.out.println(name.charAt(0));
		System.out.println(name.substring(11));
		System.out.println(name.substring(0, 10));
		System.out.println(name.indexOf('t'));
		System.out.println(name.indexOf('t', name.indexOf('t') + 1));
		System.out.println(name.indexOf('t', name.indexOf('t', name.indexOf('t') + 1) + 1));
		System.out.println(name.indexOf('z'));
		System.out.println(name.trim());
		String date = "03/04/2024";
		System.out.println(date.replace('/', '-'));
		String course = "Software Testing";
		name = name.concat(course);
		System.out.println(name.length());

		course = name.replaceAll(course, "");
		System.out.println(course);
		System.out.println(name.length() - course.length());
		// name = name.substring(name.length() - course.length());
		name = name.replace(course, "");
		System.out.println(name);
		System.out.println(name.equals("software testing"));
		System.out.println(name.equalsIgnoreCase("software testing"));
		System.out.println(name.compareTo("Software Testing"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String address = "H.no:3-219;street:ayyappa society;mandal:madhapur;dist:hydearabad;pincode:500081;state:TG";
		String[] ar = address.split(";");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println(Arrays.toString(ar));

	}

}

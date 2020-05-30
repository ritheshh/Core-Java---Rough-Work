package com.conversions;

public class StringToNumber {

	public static void main(String[] args) {
		String s = "103";
		
		int num = Integer.parseInt(s);
		System.out.println(num);
		
		num = Integer.valueOf(null);
		System.out.println(num);
		
		/*
		 * Both Integer.parseInt(String s) & Integer.valueOf(String) will result in
		 * NumberFormatException if the input is either null or any non-integer.
		 * There will be no NullPointerException even if the String is null.
		 */
	}

}

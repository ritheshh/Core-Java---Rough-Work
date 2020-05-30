package com.conversions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberToString {

	public static void main(String[] args) {
		int num = 987;
//		Integer.toString(int num) -> will never accept 'null' as an input and will result in error.
//		which is a drawback.
		System.out.println(Integer.toString(num));

//		String.valueOf(int num) -> will accept null as an input but result in NullPointerException.
//		Exception is always better than error, as it can be handled.
		System.out.println(String.valueOf(num));

//		String.format("%d", num) -> will format arguments into String and will accept null 
//		as a String with "null" as value.
		String s = String.format("%d", null);
		System.out.println(s + " " + s.length());
		
		String t= null + "";
		System.out.println(t + " " + t.length());
	}

}

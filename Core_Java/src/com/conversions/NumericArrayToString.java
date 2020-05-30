package com.conversions;

import java.util.Arrays;

public class NumericArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		String string = Arrays.toString(intArray);
		System.out.println(string);
		string = string.replace(",", "");
		string = string.replace(" ", "");
		string = string.replace("]", "");
		string = string.replace("[", "");
		System.out.println(string);
		
		String string2 = Arrays.toString(intArray);
		System.out.println(string2);
		string2 = string2.replace(",", "");
		string2 = string2.replace(" ", "");
		string2 = string2.substring(1, string2.length()-1);
		System.out.println(string2);
	}
	
}

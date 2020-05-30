package com.conversions;

import java.util.Arrays;

public class CharToString {
	public static void main(String[] args) {
		char ch = 'r';
		System.out.println(String.valueOf(ch)); // null as an input will cause an NullPointerException.

		System.out.println(Character.toString(ch)); // null as an input will cause compile-time error.

		String str = ch + "";
		System.out.println(str);

		/*
		 * In case of character array:
		 */
		char[] charArray = new char[] { 'h', 'e', 'l', 'l', 'o' };
//		Arrays.toString() converts entire array including the square brackets, making '[' index[0] 
		System.out.println(Arrays.toString(charArray) + "; index[0]='" + Arrays.toString(charArray).charAt(0) + "'");

//		To get the String alone out:		
		String string = new String(charArray);
		System.out.println(string);

//		valueOf(char[]) and copyValueOf(char[]) are methods with exact same implementation. 
//		(Deprecating one or other method would be counter-productive because it would prompt people to "fix" code that isn't broken.)
		System.out.println(String.valueOf(charArray));
		System.out.println(String.copyValueOf(charArray));

//		Using StringBuilder:
		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
			sb.append(c);
		}
		System.out.println(sb + "; printing as String: " + sb.toString());

	}
}

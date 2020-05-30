package com.conversions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) {
		String string = "hello world";
		
		//System.out.println("print the index[9]:" + string.charAt(9));
		
		/*
		 * In case of character array:
		 */
		System.out.println(Arrays.toString(string.toCharArray()));
		
//		return is null for <stringObj>.getChars()
		char[] charArray = new char[string.length()];
		string.getChars(0, string.length(), charArray, 0);
		System.out.println(charArray);
		System.out.println(charArray.toString());
		
		/*
		 * println(char[]) is a overload method which is a special case for printing
		 * character array, hence println(charArray) is been printed as a String. But incase of println(charArray + "anything"), 
		 * i.e. when println consists of any other argument along with char[], then it will consider char[] as a string through charArray.toString
		 * which will result in garbage values.
		 */		
	}

}

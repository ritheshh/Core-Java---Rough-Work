package com.statictrails;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hello, wor!dss in Java";
		StringBuilder temp = new StringBuilder();
		String word = "";
		
		int tempLength = 0;
		int length = 0;
		
		for(int i = 0; i<string.length(); i++) {
			string = string.toLowerCase();
			if((string.charAt(i) >= 'a') && (string.charAt(i) <= 'z')) {
				temp.append(string.charAt(i));
				tempLength++;
				if(length < tempLength) {
					length = tempLength;
					word = temp.toString();
				}
			}
			else if (string.charAt(i) == ' '){
				temp = new StringBuilder();
				tempLength = 0;
			}
		}
		System.out.println(word + " " + length);
	}

}
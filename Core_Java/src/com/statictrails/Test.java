package com.statictrails;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hello, wor!d in Java";
		String[] temp = string.replaceAll("[^a-zA-Z ]", "").split("\\s+");
		
		int length = 0;
		String longestWord = "";
		
		for(int i = 0; i<temp.length; i++) {
			//System.out.println(temp[i] + temp[i].contains("\\p{Punct}"));
			
			if(length < temp[i].length()) {
				length = temp[i].length();
				longestWord = temp[i];
			}
		}
		System.out.println(longestWord + " " + length);
	}

}

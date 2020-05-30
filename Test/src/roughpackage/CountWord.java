package roughpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {
	static Map<String, Integer> countMap = new HashMap<>();

	public static void main(String[] arg) {
		
		String s1 = "I am Rithesh";
		String s2 = "Rithesh is working in Full creative";
		String s3 = "I am working";
		
		addStringToHashMap(s1);
		addStringToHashMap(s2);
		addStringToHashMap(s3);
		
		getCountForWord();
	}

	static void addStringToHashMap(String str) {
		
		String[] strArray = str.split(" ");
		
		for(int i=0; i<strArray.length; i++) {
			int count = 1;
			if(countMap.containsKey(strArray[i]) != true) {
				countMap.put(strArray[i], count);
			} else {
				count = countMap.get(strArray[i]) + 1;
				countMap.put(strArray[i], count);
			}
		}		
	}

	static void getCountForWord() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Total count of the word is: " + countMap.get(word));
	}
}
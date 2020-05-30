package roughpackage;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapCountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdabeeea";
		addToTreeMap(input);
		

	}
	
	static void addToTreeMap(String input) {
		
		char highestCharacter = '\u1000';
		int highestCharacterCount = 0;
		char[] array = input.toCharArray();
		TreeMap<Character, Integer> tMap = new TreeMap<Character, Integer>();
		
		for(char element: array) {
			int count = 1;
			if(tMap.containsKey(element)) {
				count = tMap.get(element);
				tMap.put(element, ++count);
			} else {
				tMap.put(element, count);
			}
		}
		
		Set<Character> keys = tMap.keySet();
		for(char element : keys) {
			if(tMap.get(element) > highestCharacterCount) {
				highestCharacterCount = (tMap.get(element));
				highestCharacter = element;
			}
		}
		
		System.out.println(tMap);
		System.out.println(highestCharacter + " " + highestCharacterCount);
	}

}

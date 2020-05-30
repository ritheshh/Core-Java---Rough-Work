import java.util.HashMap;
import java.util.Map;

public class PrintStringCountUsingMap {
	static Map<String, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ram is an athlete";
		String s2 = "Ram is an Indian";
		String s3 = "Kevin is a musician";
		String s4 = "Kevin is an American";
		String s5 = "Ram and Kevin are friends";

		printStringCountMap(s1);
		printStringCountMap(s2);
		printStringCountMap(s3);
		printStringCountMap(s4);
		printStringCountMap(s5);
	}
	
	static void printStringCountMap(String str) {
		
		String tempString[] = str.split(" ");
		
		for(int i=0; i<tempString.length; i++) {
			int value =1;
			if(map.containsKey(tempString[i]) == true) {
				value = map.get(tempString[i]);
				map.put(tempString[i], ++value);
				System.out.print(value + " ");
			}
			else {
				map.put(tempString[i], value);
				System.out.print(value + " ");
			}
		}
		System.out.println();
	}

}

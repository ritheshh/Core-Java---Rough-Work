package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Robbie", 596);
		hashMap.put("Rahul", 345);
		hashMap.put("Sam", 507);
		hashMap.put("Ause", 489);
		hashMap.put("Paul", 587);
		
		System.out.println(hashMap);
		
		// keySet() method is used to get the set of keys in the map.
		System.out.println(hashMap.keySet() + "\n");
		Set<String> keys = hashMap.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + hashMap.get(key));
		}		
	}
}

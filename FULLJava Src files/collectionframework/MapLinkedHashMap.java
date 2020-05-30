package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapLinkedHashMap {
	public static void main(String[] args) {
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("Robbie", 596);
		linkedHashMap.put("Rahul", 345);
		linkedHashMap.put("Sam", 507);
		linkedHashMap.put("Ause", 489);
		linkedHashMap.put("Paul", 587);
		
		// In LinkedHashMap, the keys are stored in the order in which they are entered.
		System.out.println("LINKED HASH MAP:");
		//Only the reference is returned here. To store keys, Set has to be created using  'new' key word.
		Set<String> keys = linkedHashMap.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + linkedHashMap.get(key));
		}

		System.out.println("\n\nTREE MAP: ");
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(linkedHashMap);
		treeMap.put("Zorak", 123);
		treeMap.put("Ash", 501);
		
		treeMap.remove("Rahul"); // Removing a key-value pair from the map.

		// Getting the values of Map into a Set using entrySet();
		Set<Map.Entry<String, Integer>> values = treeMap.entrySet();
		for(Map.Entry<String, Integer> e : values) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		
	}
}

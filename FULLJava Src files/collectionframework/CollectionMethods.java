package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CollectionMethods {

	public static void main(String[] args) {

		int[] intArray = new int[] { 3, 5, 7, 9, 14, 22, 56, 89, 96, 77 };
		Collection<Integer> arrayList = new ArrayList<Integer>();
		
//		To convert a Array to List:
//			String or Objects - 'Arrays.asList(a)' can be used.
//			int/double array - In this case either for loop or Arrays.stream(array) need to be used.
		for (int i : intArray) {
			arrayList.add(i);
		}
		System.out.println("'for' loop is used to fill the arrayList" + arrayList);
		arrayList.clear(); // clear() is used to empty the collection.
		arrayList.add(1);
		arrayList.add(1);
		System.out.println("arrayList.clear(): " + arrayList);
		arrayList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		System.out.println("Array.stream(intArray) used to fill the arrayList: " + arrayList);
		
		System.out.println(Arrays.toString(intArray) + " " + arrayList);
		arrayList.clear();
		System.out.println(Arrays.toString(intArray) + " " + arrayList);
		
		Collection<Integer> hashSet = new HashSet<>();
		hashSet.add(13);
		hashSet.add(22);
		hashSet.add(34);
		hashSet.add(96);
		hashSet.add(15);
		System.out.println("\nPrinting hashSet: " + hashSet);
		// addAll(<E>) is used to add all the elements of one collection into another.
		hashSet.addAll(arrayList);
		System.out.println("elements of arrayList is added to hashSet: " + hashSet);
		
		arrayList.clear();
		arrayList.addAll(hashSet);
		System.out.println(arrayList);
		System.out.println(hashSet);
		System.out.println(arrayList.equals(hashSet));

//		To convert a List to Array:
//			String or Objects - '<E>.toArray()' can be used.
//			int/double list - In this case either for loop or <E>.stream() need to be used.
		Integer[] newArray = hashSet.toArray(new Integer[hashSet.size()]);
		//int[] newArray =  hashSet.stream().mapToInt(i -> i).toArray();
		System.out.println("\nPrinting collection converted to newArray: " + Arrays.toString(newArray));
		
		
		String[] str = new String[] {"hi", "how", "are", "you"};
		Collection<String> strList = new ArrayList<String>();
		strList.addAll(Arrays.asList(str));
//		strList.clear();
//		System.out.println(strList);
//		System.out.println(Arrays.toString(str));
		
		Collection<String> tmpStrList = new ArrayList<String>(Arrays.asList(new String[] {"hi","how","are","you"}));
		String[] tmp = tmpStrList.toArray(new String[strList.size()]);
		tmpStrList.clear();
		System.out.println(Arrays.toString(tmp));
		

	}

}

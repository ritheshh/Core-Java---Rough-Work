package collectionframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasicsOfSet {

	public static void main(String[] args) {
		 
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(5);
		hashSet.add(4);
		hashSet.add(93);
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(34);
		hashSet.add(23);
		hashSet.add(9);

		// HashSet stores the values in a hash sequence which is completely random.
		System.out.println(hashSet);
		
		// Difference between Set and ArrayList is that Set does not accept duplicate values.
		System.out.println("Adding 34 again to the set: " + hashSet.add(34));

		Set<Integer> secondSet = new HashSet<Integer>();
		secondSet.addAll(Arrays.asList(new Integer[] {9, 8, 7, 6, 5, 4, 3, 2, 1}));
		System.out.println("\nElements in secondSet: " + secondSet);
		
		HashSet<Integer> tempSet = new HashSet<Integer>(hashSet);
		tempSet.addAll(secondSet);
		System.out.println("\nUnion of elements of hashSet and secondSet: " + tempSet);
		
		// clone() method is used to create a coppy of ArrayList.
		tempSet = (HashSet<Integer>) ((HashSet) hashSet).clone();
		tempSet.retainAll(secondSet);
		System.out.println("\nRetaining the commmon elements of hashSet and secondSet: " + tempSet);
		
		tempSet = (HashSet<Integer>) ((HashSet) hashSet).clone();
		tempSet.removeAll(secondSet);
		System.out.println("\nRemoving all the elements of secondSet from hashSet: " + tempSet);
		
		
		Set<Integer> treeSet = new TreeSet<Integer>(hashSet);
		System.out.println("\nTree set stores all the elements in acending order: " + treeSet);
				
	}

}

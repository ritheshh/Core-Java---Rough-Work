package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class ListLinkedList {
	public static void main(String args[]) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("everyone");
		linkedList.add("in");
		linkedList.add("the");
		linkedList.add("house");
		linkedList.add("of");
		System.out.println(linkedList);
		
		
		linkedList.addFirst("Hello"); // Adds the element as in the head of the list.
		linkedList.addLast("Robbie"); // Adds the element at the last.
		linkedList.add(6, "Margeret"); // Index numbers of LinkedList also start from [0] just like Arrays.
		
		System.out.println("\nPrinting the LinkedList after various add operations: ");
		System.out.println(linkedList);
		
		// Removing elements from the linked list
		linkedList.remove("Hello"); 
		linkedList.remove(0); 
		linkedList.removeFirst(); 
		linkedList.removeLast();
		
        System.out.println("\nPrinting the LinkedList after various remove operations: ");
		System.out.println(linkedList);
		
		// Finding elements in the linked list using contains(E) method which return a boolean value.
		System.out.println("\nList contains the element \"house\": " + linkedList.contains("house"));
		
		//Number of elements in the list using size(E) method.
		System.out.println("\nSize of the list: " + linkedList.size());
		
		// get([index]) method is used to get the element in a particular index.
		System.out.println("\nget(): " + linkedList.get(3));
		
		// set() replaces the element in the specified index with the specified element.
		linkedList.set(3, "Julie");
		System.out.println("\nReplaced 'Margeret' with 'Julie' in the list: " + linkedList);
		
		System.out.println("\nIndex of 'house' is: " + linkedList.indexOf("house"));
		
	}
}

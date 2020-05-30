package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Collection framework was introduced in JDK 1.2 to solve the hassle
		 * programmers face while accessing the data structures like Arrays,
		 * Hashtables and Vectors using various methods for each of them. 
		 *
		 * Collection: Group of interfaces and classes which implement 
		 * some common methods. Pre-written algorithm for data structures, thus
		 * increasing the speed to program and quality.
		 */	
		
		Collection values = new ArrayList(); //values is of type object.
		values.add(9);
		values.add(8);
		values.add("Any data-type can be added.");	
		System.out.println(values);
		
		/*
		 * There 2 techniques to print the values in ArrayList:
		 * 1. Using Iterator.
		 * 2. Using Enhanced for loop.
		 */	
		System.out.println("\nPrinting values in ArrayList using Iterator: ");
		Iterator i = values.iterator();
		while(i.hasNext())
			System.out.println(i.next());
				
		System.out.println("\nPrinting values in ArrayList using Enhanced for-loop: ");
		for(Object c : values)
			System.out.println(c);
		
		/*
		 * In the above code, There are few problems: 
		 * 1. Object of the class ArrayList, will accept input of any data-type. Thus, a String 'Any data-type can be added.' 
		 * is accepted along the integer '9, 8'. To overcome this GENERICS is to be introduced.
		 * 2. We cannot access index specific values when an object of ArrayList is created with its reference as Collection.
		 * To overcome this we need to create the reference of the object more specifically like 'List'.
		 * 
		 * (e.g) List <Integer> values = new ArrayList<>(); //<Integer> is the generic here.
		 */	
		System.out.println("\nCreating a ArrayList using Integer generic. (i.e) An Integer ArrayList: ");
		List<Integer> intValues = new ArrayList<Integer>();
		intValues.add(13);
		intValues.add(45);
		intValues.add(77);
		intValues.add(5);
		intValues.add(6);
		//intValues.add("Any data-type can be added."); // This will cause compile-time error if uncommented.

		System.out.println(intValues);
		System.out.println("Removing '5' from the ArrayList using intValues.remove(new Integer(5));");
		intValues.remove(new Integer(5));
		/*
		 * The remove() method is overloaded and comes in two variants, which is problematic when it comes to the removal 
		 * of integer elements. Thus it is removed by creating a Wrapper class Integer object using 'new Integer(6)'.
		 */
		System.out.println(intValues);
		
		System.out.println("Adding a value '10' between [0] and [1]");
		intValues.add(1, 10);
		System.out.println(intValues);
		
		System.out.println("There are many predefined methods in collection framework, one such method is for sorting: ");
		Collections.sort(intValues);
		System.out.println(intValues);
		
		// We can also print the ArrayList using stream API which uses Lamda expression.
		System.out.println("\nPrinting the sorted ArrayList using stram API: ");
		intValues.forEach(System.out::println);
	}
}

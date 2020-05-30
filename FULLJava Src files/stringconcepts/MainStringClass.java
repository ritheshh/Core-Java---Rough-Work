package stringconcepts;

import java.util.Scanner;

public class MainStringClass {
	/*
	 * String is a class implemented from 'Serializable', 'Comparable' and
	 * 'CharSequence' interfaces. An object of String class basically represents a
	 * sequence of characters. 'String', 'StringBuffer' and 'StringBuilder' are
	 * classes which are implemented from 'CharSequence' interface is used to
	 * represent the sequence of characters.
	 * 
	 * Two ways to create a string object: 
	 * 1. String Keyword: (String s="welcome";)
	 * Each time you create a string literal, the JVM checks the
	 * "string constant pool" first. If the string already exists in the pool, a
	 * reference to the pooled instance is returned. If the string doesn't exist in
	 * the pool, a new string instance is created and placed in the pool. String
	 * s1="Welcome"; String s2="Welcome";(It doesn't create a new instance)
	 * 
	 * 2. By new Keyword: (String s=new String("Welcome");
	 * This creates two objects and one reference variable. A new string object will 
	 * be created in heap memory and a string literal "welcome" will be placed in 
	 * "string constant pool". The variable s will refer to the object in a heap.
	 * String s1=new String("Welcome"); String s2=new String("Welcome");
	 * s1 == s2 is FALSE!!, because s1 and s2 hold references which are different for s1 and s2.
	 */
	
	public MainStringClass() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("STRING: \n1.String objects are immutable. \n2.String Compare. "
				+ "\n3.Various methods in string \n4.StringBuffer \n5.StringBuilder \n");
		System.out.print("Enter the string concept that you want to learn:\t");
		int choice = sc.nextInt();
		System.out.println("\n");
		switch (choice) {
		case 1:
			new ImmutableString();
			break;
		case 2:
			new StringCompare();
			break;
		case 3:
			new StringMethods();
			break;
		case 4:
			new StringBufferClass();
			break;
		case 5:
			new StringBuilderClass();
			break;
		}
	}
}

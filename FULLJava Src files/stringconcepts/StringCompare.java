package stringconcepts;

public class StringCompare {
	String str1 = "Hello World";
	String str2 = "Hello World";
	String str3 = new String("Hello World");
	String str4 = new String("Hello World");
	
	public StringCompare() {
		// TODO Auto-generated constructor stub
		compareUsingEquals();
		compareUsingOperator();
		str2 += " from JAVA";
		System.out.println("\nChanged str2 to: " + str2);
		compareUsingCompareTo();
	}
	
	void compareUsingEquals() {
		//Compares the original content of the string.
		System.out.println("Comparing strings using equals()");
		System.out.println("str1.equals(str2) " + str1.equals(str2));
		System.out.println("str1.equals(str2) " + str1.equals(str4));
		System.out.println("str1.equals(str3) " + str1.equals(str4));		
	}
	
	void compareUsingOperator() {
		//Compares the values the variables are holding, which are basically references.
		System.out.println("\nComparing strings using ==");
		System.out.println("str1==str2 " + (str1==str2));
		/*
		 * str1 and str2 are currently holding the reference of "Hello World", which is
		 * in the "string constant pool" of heap memory. Hence, these to will be holding 
		 * the same reference value.
		 * 
		 * str3 and str4 are holding two DIFFERENT references of the string objects 
		 * created using new keyword.
		 */
		System.out.println("str2==str4 " + (str2==str4));
		System.out.println("str3==str4 " + (str3==str4));
	}
	
	void compareUsingCompareTo() {
		/*
		 * Lexicographically compares the original content of the string.
		 * Returns an integer based on Lexicographical comparison.
		 * 
		 */		
		System.out.println("Comparing strings using compareTo()");
		System.out.printf("str1: %s\nstr2: %s\nstr3: %s\n",str1,str2,str3);
		System.out.println("str1.compareTo(str3) " + str1.compareTo(str3));
		System.out.println("str1.compareTo(str2) " + str1.compareTo(str2));
	}
}

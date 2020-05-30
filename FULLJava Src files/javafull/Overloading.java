package javafull;

public class Overloading {
	Sum obj = new Sum();
	Overloading() {
		System.out.println("OVERLOADING: Also known as Compile-time Polymorphism. "
				+ "/nMethods having same name and return type "
				+ "but differnent type or number of arguments. \nIn the example below "
				+ "String is used, so the method having String has arguments will be called.");
		obj.add("Hello", "World");
	}
}

class Sum {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(String a, String b) {
		System.out.println(a + b);
	}

/*	
 * Disabling the below comment will lead to error as only method name, 
 * number and type of parameters are considered for Overloading. *NOT return type*
 */
//	int add(int a, int b) {
//		
//		return (a+b);
//	}
}

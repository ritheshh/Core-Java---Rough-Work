package javafull;

public class WrapperClass {
	/*
	 * Are used to convert primitive data types to Objects and vice versa. These
	 * objects belong to the class named Number and Serialize, in the package
	 * java.lang and java.io. 
	 * Purpose: Could be used in methods that require primitive data to be passed as objects.
	 * They are just a convenience. NOT USED to overcome the call by value operation in java
	 */

	int number = 10;
	Integer intObj = new Integer(number);
	
//	convert primitive data types to Objects
	void autoboxing() {
		System.out.println("1. Autoboxing: Primitive to Object");
		System.out.printf("Initial values: number = %d, Interger object = %d\n", number, intObj);
		
//		Passing primitive data and object as arguments to a method to 
//		change the value through reference
		changeValues(number, intObj);
		System.out.printf("Final values: number = %d, Interger object = %d\n", number, intObj);
//		Values still remain the same because Wrapper objects are immutable.
//		They create a new instance each time their state is modified.
	}
	
//	convert Objects to primitive data types
	void unboxing() {	
		System.out.println("\n2. Unboxing: Object to Primitive");
		int primitiveData = intObj;
		
		System.out.printf("\n Object changed to primitiveData = %d", primitiveData);
	}
	void changeValues(int value, Integer object) {
		value = 200;
		object = 200;		
	}
}

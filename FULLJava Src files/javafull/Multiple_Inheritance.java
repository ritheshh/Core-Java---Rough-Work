package javafull;

public class Multiple_Inheritance {
	Output obj = new Output();
	Multiple_Inheritance() {
		System.out.println("\n MULTIPLE INHERITANCE"
				+ "\nWe can achieve multiple inheritance only through INTERFACES,"
				+ "as classes in Java does not support multiple inheritance");
		obj.assignValue(2);
		obj.printNumberOfChildren();
	}
}

/*
 * We can achieve multiple inheritance only through INTERFACES, as classes in
 * Java does not support multiple inheritance
 */

interface Father {
	void printNumberOfChildren();
}

interface Mother {
	void assignValue(int value);
}

interface Child extends Father, Mother {
	void printNumberOfChildren();
	void assignValue(int value);
}

class Output implements Child {
	int children;
	
	public void printNumberOfChildren() {
		System.out.println("Number of Children = " + children);
	}
	public void assignValue(int value) {
		this.children = value;
	}
} 

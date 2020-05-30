package javafull;

public class AbstractClass {
	SubNormalClass obj = new SubNormalClass();
	AbstractClass() {
		System.out.println("ABSTRACT CLASS:");
		obj.printPurpose();
	}
}

abstract class BaseAbstractClass {
	abstract void printPurpose();
}


class SubNormalClass extends BaseAbstractClass {
	void printPurpose() {
		System.out.println("The main purpose of an abstract class is, it acts as a base class "
				+ "for all its sub class (to declare the methods)");
	}
}
package javafull;

public class Multi_Hierarchical_Inhertance {
    Three obj = new Three();
    Multi_Hierarchical_Inhertance() {
    	System.out.println("\n MULTI-LEVEL & HIERARCHICAL INHERITANCE");
    	obj.printEmployee();
    }
}

class SuperClass {
	String string = "Full ";
}

class SubClass extends SuperClass {
	/*
	 * A derived class will be inheriting a base class and as well as the derived
	 * class also act as the base class to other class. 'SuperClass' is the base class 
	 * for 'SubClass'. 'One', 'Two', 'Three' are the sub classes of 'SubClass'.
	 */
	SubClass() {
		System.out.println(super.string + "Creative ");
	}
}

/*
 * In Java, a class cannot directly access the grandparent’s members. So, the
 * classes 'One', 'Two', 'Three' can only access the members & variables of its
 * base class 'SubClass' and not of the class 'SuperClass'.
 * 
 * in hierarchical Inheritance, one class serves as a base class for more than one sub class.
 */

class One extends SubClass {
	void printEmployee() {
		System.out.println("Developer 1");
	}
}

class Two extends SubClass {
	void printEmployee() {
		System.out.println("Developer 2");
	}
}

class Three extends SubClass {
	void printEmployee() {
		System.out.println("Developer 3");
	}
}
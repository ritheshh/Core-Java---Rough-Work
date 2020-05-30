package javafull;

public class InterfaceClass {
	InterfaceClass() {
		System.out.println("INTERFACES: Provides total Abstraction. "
				+ "Advantage: Multiple inheritance is supported.");
		Output obj = new Output();
		obj.assignValue(2);
		obj.printNumberOfChildren();
	}
}
/* 		--- (File: Multiple_Inhertitance.java) ---
 * 
 * interface Father { void printNumberOfChildren(); }
 * 
 * interface Mother { void assignValue(int value); }
 * 
 * interface Child extends Father, Mother { 
 * void printNumberOfChildren(); 
 * void assignValue(int value); 
 * }
 * 
 * class Output implements Child { 
 * int children;
 * 
 * public void printNumberOfChildren() {
 * System.out.println("Number of Children = " + children); 
 * } 
 * public void assignValue(int value) 
 * { this.children = value; 
 * } }
 */
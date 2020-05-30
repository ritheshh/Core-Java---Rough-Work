package javafull;

public class Default_Initialization_Instance_Variable {

	int num;
	double decimal;
	String string;
	boolean bool;
	Default_Initialization_Instance_Variable() {
		System.out.println("Default Initialization Of Instance Variable, is done "
				+ "when an object of the class is created and default constructor is called.");
		System.out.printf("num: %d \ndecimal: %f \nstring: %s \nbool: %b", num, decimal, string, bool);
	}
}

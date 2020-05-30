package javafull;

public class Overriding {
	Result obj = new Result();
	Overriding() {
		System.out.println("OVERRIDING: Also known as Run-time Polymorphism. "
				+ "\nBase and sub class should have a method with same name, arguments,"
				+ "and return type.");
//		printMark() of the class 'Test' is overriden by that of subclass 'Result'.
		obj.printMark();
	}
}

class Test {
	int mark = 50;
	void printMark() {
		System.out.println("Mark obtained in the test is: " + mark);
	}
}

/*
 * Methods declared as static and final cannot be overriden. Constructors and
 * methods declared as private cannot be overriden.
 */

class Result extends Test {
	void printMark() {
		System.out.println("Results of the test is: " + super.mark);
	}
}
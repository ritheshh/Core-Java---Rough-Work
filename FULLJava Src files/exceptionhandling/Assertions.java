package exceptionhandling;

import java.util.Scanner;

public class Assertions {
	Scanner sc = new Scanner(System.in);

	public Assertions() {
		// TODO Auto-generated constructor stub
		System.out.println("ASSERTION: Used in test scenarios to throw an ERROR"
				+ "if the expected condition fails.\n");
		
		System.out.print("Enter ur age: ");
		int age = sc.nextInt();
		/*
		 * Syntax: assert expression; (or) assert expression1 : expression2; 
		 * if the expression is FALSE - then ERROR will the thrown, terminating the program.
		 * Assertion is disabled by default, '-ea' (enable assertion) is used to run the
		 * program (e.g. java -ea AssertionExample).
		 */
		assert age>18:" Not valid";
		System.out.println("value is " + age);
	}
}

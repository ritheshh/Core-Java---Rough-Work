package exceptionhandling;

import java.util.Scanner;

public class RuntimeExcep {

	int a, b, divide;
	int array[] = new int[5];
	Scanner sc = new Scanner(System.in);
	String string = null;

	public RuntimeExcep() {
		printDivisionResult();
		setArrayValues();
		getStringLength();
	}

	void printDivisionResult() {
		System.out.println("divide=a/b | Enter the values of a and b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			divide = a / b;
			System.out.println("Divide = " + divide);
		} catch (ArithmeticException e) {
			System.out.println("Value of b is '0' " + e);
			e.printStackTrace();
		} finally {
			/*
			 * 'finally' block is used to execute important code such as
			 * closing connection, stream. This block will be executed independent of the
			 * occurrence of the exception.
			 */			
			sc.close();
			System.out.println("Finally block has been executed, closing the scanner 'sc.close()'");
		}
	}

	void setArrayValues() {
		try {
			System.out.println("\nFilling up values of array: ");
			for (int temp = 0; temp < 10; temp++) 
				array[temp] = temp;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is only " + array.length + " " + e);
			e.printStackTrace();
		}
	}

	void getStringLength() {
		try {
			System.out.println("\nLength of the string is: " + string.length());
		} catch (NullPointerException e) {
			System.out.println("String is NULL " + e);
			e.printStackTrace();
		}
	}

	// NumberFormatException
	// StringIndexOutOfBoundsException
}

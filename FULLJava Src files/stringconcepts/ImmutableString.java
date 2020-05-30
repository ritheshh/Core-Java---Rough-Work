package stringconcepts;

import java.util.Scanner;

class TestImmutableString {
	String name;
}

public class ImmutableString {
	public ImmutableString() {
		// TODO Auto-generated constructor stub
		TestImmutableString obj = new TestImmutableString();
		setName(obj);
		obj.name.concat(" World");
		printName(obj);
		/*
		 * Output will be 'Hello' & NOT 'Hello World', since String is immutable and 
		 * Java is always pass by value.
		 */	
		obj.name = obj.name.concat(" World");
		printName(obj);
	}

	void setName(TestImmutableString test) {
		System.out.print("Enter a string:\t");
		Scanner sc = new Scanner(System.in);
		test.name = sc.nextLine();
		sc.close();
	}

	void printName(TestImmutableString test) {
		System.out.println("\nName is: " + test.name);
	}
}

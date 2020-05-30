package javafull;

public class Constructor {
	static {
		System.out.println("CONSTRUCTOR, is used to initialize the state of an object.");
	}
	Constructor() {
		System.out.println("Default constructor is called");
	}
	Constructor(int num) {
		System.out.println("Constructor with a single integer argument is being called.");
	}
	Constructor(int a, int b) {
		System.out.println("Constructor with two integer arguments is called.");
	}
}

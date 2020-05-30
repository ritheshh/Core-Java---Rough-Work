package javafull;

public class Blocks {
Blocks() {
	
	StaticBlock staticObj1 = new StaticBlock();
	StaticBlock staticObj2 = new StaticBlock();
	
	InitializerBlock initObj1 = new InitializerBlock();
	InitializerBlock initObj2 = new InitializerBlock();
}
}

class StaticBlock {
	static {
		System.out.println("Static Block will only be called once, "
				+ "no matter how many objects are created. "
				+ "This block will be called even prior to the CONSTRUCTOR");
	}
	StaticBlock() {
		System.out.println("Constructor of class 'StaticBlock' called.");
	}
}

class InitializerBlock {
	{
		System.out.println("The block will be called every time an object is created and "
				+ "the block will only be called when an object is created.");
	}
	InitializerBlock() {
		System.out.println("Constructor of class 'InitializerBlock' called.");
	}
}
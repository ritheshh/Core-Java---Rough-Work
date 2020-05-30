package innerclass;

class A {
	
	class B {
		void printHello() {
			System.out.println("Hello, this is a normal method inner class.");
		}
	}
	
	static class C {
		void printStaticInnerClass() {
			System.out.println("This is a Static inner class.");
		}
	}
}

public class InnerClassBasics {

	public static void main(String[] args) {
		/*
		 * To call the method printHello(), first we need to create an object of class A, and only 
		 * using that object we will be able to create the an object of class B.
		 */	
		A objOfA = new A();
		A.B objOfB = objOfA.new B();
		objOfB.printHello();
		
		A.C objOfC = new A.C();
		objOfC.printStaticInnerClass();
		}
}

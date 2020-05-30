package exceptionhandling;

public class NormalExceptionPropagation {

	void a() {
		/*
		 * throw new java.io.IOException("device error"); 
		 * The above code will result in compile-time error, as IOException is a checked Exception. 
		 * Checked exception can only be propagated by declaring it using 'throws' keyword 
		 * priorly along the method.
		 */
		
		//'throw' keyword can be directly used to propagate any runtime exception.
		if(true)
			throw new NumberFormatException("booboo"); //
		
		//Once an exception occurs the rest of the code below is not executed.
		System.out.println("'a()' is called, performing divide=50/0");
		int divide = 50 / 0; //This will throw an arithmetic exception.
	}

	void b() {
		System.out.println("'b()' is called");
		a();
	}

	void c() {
		System.out.println("'c()' is called");
		try {
			b();
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException has been handled " + e);
		} catch (Exception e) {
			/*
			 * Order of exception should always be most specific to general. Compile-time
			 * error will be thrown if the 'Exception' block is used before
			 * 'ArithmeticException' block.
			 */			
			System.out.println("Exception has been handled " + e);
		}
	}

	public NormalExceptionPropagation() {
		// TODO Auto-generated constructor stub
		System.out.println("\nConstructor 'NormalExceptionPropagation()' is called\n");
		c();
		System.out.println("\nRemaining code after exception is executed.");
	}
}

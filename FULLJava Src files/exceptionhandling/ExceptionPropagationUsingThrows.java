package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPropagationUsingThrows {

	void a() throws IOException, SQLException{
		/*
		 * 'throws' keyword is only used to declare the exception and its completely
		 * alright even if the exception doesn't occur.
		 */		
		if(false)
			throw new IOException("IOException is thrown."); 
		
		if(true)
			throw new SQLException("SQLExecption is thrown.");
		
		/*
		 * As the above if() statement is TRUE, exception will be thrown and the below
		 * code will not be executed.
		 */		
		if (true)
			throw new NumberFormatException("Unchecked - NumberFormatException is thrown."); //

		// Once an exception occurs the rest of the code below is not executed.
		System.out.println("'a()' is called, performing divide=50/0");
		int divide = 50 / 0; // This will throw an arithmetic exception.
	}

	void b() throws IOException, SQLException{
		System.out.println("'b()' is called");
		a();
	}

	void c() {
		System.out.println("'c()' is called");
		try {
			b();
		} catch (Exception e) {
			System.out.println("Exception has been handled " + e);
		}
	}

	public ExceptionPropagationUsingThrows() {
		// TODO Auto-generated constructor stub
		System.out.println("\nConstructor 'ExceptionPropagationUsingThrows()' is called\n");
		c();
		System.out.println("\nRemaining code after exception is executed.");
	}
}

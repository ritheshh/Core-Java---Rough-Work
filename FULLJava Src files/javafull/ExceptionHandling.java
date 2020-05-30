package javafull;

import exceptionhandling.*;

public class ExceptionHandling {
	
	{
		System.out.println("There are 2 types of exception: \n1. Checked Exception: "
				+ "These exceptions are checked at compile-time, and need to be corrected by the programmer. "
				+ "The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions. "
				+ "\n2. Unchecked Exception: These exemptions occur in run-time. The classes which inherit Runtime Exception are known as unchecked exceptions.");			
	}
	public ExceptionHandling() {
		// TODO Auto-generated constructor stub
		new exceptionhandling.RuntimeExcep();
		new exceptionhandling.NormalExceptionPropagation();
		new exceptionhandling.ExceptionPropagationUsingThrows();
	}
	
}

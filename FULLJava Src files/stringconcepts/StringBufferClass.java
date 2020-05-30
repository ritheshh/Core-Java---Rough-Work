package stringconcepts;

public class StringBufferClass {
	//Java StringBuffer class is used to create mutable (modifiable) string.
	public StringBufferClass() {
		// TODO Auto-generated constructor stub
		StringBuffer string = new StringBuffer("Hello World");
		
		string.append(" from JAVA");
		System.out.println(string);
		
		string.insert(5,"ooo");
		System.out.println(string);
		
		string.replace(5, string.length(), " Java");
		System.out.println(string);
		
		string.delete(0, 6);
		System.out.println(string);
		
		string.reverse();
		System.out.println(string);
		
		/*
		 * capacity() method returns the current capacity of the buffer. Default capacity is 16.
		 * If the number increases from its current capacity, then the capacity of the buffer is
		 * also increased to (oldcapacity*2)+2.
		 * 
		 * ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity.
		 */		
		System.out.println(string.capacity());
		
		string.ensureCapacity(50); //
		System.out.println(string.capacity());
		
	}
	
	
}

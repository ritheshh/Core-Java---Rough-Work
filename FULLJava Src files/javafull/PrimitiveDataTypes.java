package javafull;

public class PrimitiveDataTypes {
	int i = 33;
	long l = i;
	double d = l;
	
	PrimitiveDataTypes() {
		System.out.println("PRIMITIVE TYPE CONVERSION \nImplicit or Automatic or Widening");
		System.out.println("Int = " + i); 
        System.out.println("Long = " + l); 
        System.out.println("Double = " + d);
        
        d = 100.4567;
        System.out.println("\nExplicit conversion or Narrowing");
        System.out.println("Double = " + d +"\nLong = " + (long)d + "\nInt = " + (int)d );
	}
}

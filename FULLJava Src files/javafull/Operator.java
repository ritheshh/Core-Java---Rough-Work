package javafull;

public class Operator {
	/*
	 * Compound Statement: Assignment operators can be combined with other operators
	 * to build a shorter version of the statement
	 */
	Operator(int a, int b) {
//		*** ASSIGNMENT OPERATOR & ARITHMATIC OPERATOR ***	
		System.out.println("ASSIGNMENT OPERATOR & ARITHMATIC OPERATOR:");
		for (int i = 1; i <= 4; i++) {
//			'=' operator is used for assigning.
			a = 10; 
			b = 20;
			System.out.printf("a=10 & b=20\t");
			switch (i) {
			case 1:
				System.out.printf("Sum a+b=%d\n", (a += b));
				break;
			case 2:
				System.out.printf("Subtraction a-b=%d\n", (a -= b));
				break;
			case 3:
				System.out.printf("Multiply a*b=%d\n", (a *= b));
				break;
			case 4:
				System.out.printf("Divide a/b=%d\n", (a /= b));
				break;
			case 5:
				System.out.printf("Remainder a%b=%d\n", (a %= b));
				break;
			}
		}
		
//		*** UNARY OPERATORS: ***		
		System.out.println("\nUNARY OPERATOR:");
		System.out.println("'++'Increament operator\t'--'Decrement Operator");
		int num = 10;
		System.out.println("num=10\tnum++ = " + (num++) + " (Increament is done after the action.)");
		System.out.println("num=11\t++num = " + (++num) + " (Increament is done before the action.)");
		
//		*** RELATIONAL OPERATOR: ***
		System.out.println("\nRELATIONAL OPERATOR:");
		System.out.println("a == b: " + (a==b));
		System.out.println("a > b: " + (a>b));
		System.out.println("a < b: " + (a<b));
		System.out.println("a >= b: " + (a>=b));
		System.out.println("a <= b: " + (a<=b));
		
//		*** TERNARY OPERATOR: ***
		System.out.println("\nTERNARY OPERATOR:");
		String output = a>b?"'a' is grreater than 'b'" : "'a' is lesser than 'b'";
//		variable = Expression1 ? Expression2: Expression3 
		System.out.println(output);
		
//		*** LOGICAL OPERATOR: ***
		System.out.println("\nLOGICAL OPERATOR:");
		System.out.println("(a > b) && (a < b): " + ((a > b) && (a < b)));
		System.out.println("(a > b) || (a < b): " + ((a > b) || (a < b)));
		System.out.println("!((a > b) && (a < b)): " + !((a > b) && (a < b)));
	}
}

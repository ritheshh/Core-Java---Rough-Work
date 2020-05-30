package javafull;

public class Variables {
	
	static int value = 10; //Class variable
	
	int a = 20; //Instance variable
	int sum; //No need to initialize instance variable.	
	Variables() {
		sum = addition(a, 10);
		System.out.println("sum = " + sum);
	}
	
	int addition(int x , int y) {
		int add = 0; //Local variable - Need to initialize them.		
		add = x + y;
		return add;
	}
}

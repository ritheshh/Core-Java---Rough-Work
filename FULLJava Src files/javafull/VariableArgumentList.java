package javafull;

public class VariableArgumentList {
	String string = "sum";
	int array[] = new int[] {3,4,5,6,10};
	VariableArgumentList() {
		addition(string,array);
	}
	void addition(String input, int ...number) {
		int sum=0;
		for(int i:number) {
			sum += i;
		}
	System.out.println(input + " of the numbers in array = " + sum);
	}
}

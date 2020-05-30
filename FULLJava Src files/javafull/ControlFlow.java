package javafull;

import java.util.Scanner;

class IfElse {
	IfElse(int a, int b) {
		System.out.println("if-else statements: ");
		if (a > b)
			System.out.println("if(a > b):\t'a' is greater than 'b'");
		else if (a == b)
			System.out.println("if(a == b):\t'a' equals 'b'");
		else
			System.out.println("if(a > b):\t'b' is greater than 'a'");

	}
}

class WhileLoop {
	int i, count;

	WhileLoop() {
		System.out.println(
				"\nWhile loop: loop loops through a block of code as " + "long as a specified condition is true");
		while (i < 10) {
			count++;
			i++;
		}
		System.out.println("count = " + count);
	}
}

class DoWhileLoop {
	int i, count;

	DoWhileLoop() {
		System.out.println("\nDo-While loop: Will always be executed at least once, "
				+ "even if the condition is false, because the code block is "
				+ "executed before the condition is tested");
		do {
			count++;
		} while (i < 0);
		System.out.println("count = " + count);
	}
}

class ForLoop {
	int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int sum;

	ForLoop() {
		System.out.println("\nFor loop:");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println("\n\nFor loop enhanced in the case of arrays:");
		for (int temp : array) {
			System.out.printf("%d ", temp);
		}
	}
}

class SwitchCase {

	SwitchCase() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\nSwitch case - Enter an numnber for switch case: \t");
		int input = scanner.nextInt();
		//scanner.close();
		switch (input) {
		case 1:
			System.out.println("'1' was entered in switch case.");
			break;
		case 2:
			System.out.println("'2' was entered in switch case.");
			break;
		case 3:
			System.out.println("'3' was entered in switch case.");
			break;
		default:
			System.out.println("Enter a number between 1 - 3");
			break;
		/*
		 * break is mainly used for terminating a sequence in a switch statement, to
		 * exit a loop.
		 */
		}
	}
}

class ContinueDemo 
{ 
	ContinueDemo() {
		System.out.println("\nUse of continue statement here, to print only the odd numbers.");
        for (int i = 0; i < 10; i++) 
        { 
            if (i%2 == 0) 
                continue;
//          continue: Force an early iteration of a loop and ignore the rest of the code in the loop.
            System.out.printf("%d ", i); 
        } 
	}
}

public class ControlFlow {
	int a = 25, b = 30;

	ControlFlow() {
		new IfElse(a, b);
		new WhileLoop();
		new DoWhileLoop();
		new ForLoop();
		new SwitchCase();
		new ContinueDemo();
	}
}

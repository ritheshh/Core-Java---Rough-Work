package roughpackage;

import java.util.Scanner;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = sc.nextInt();

		int temp = number;
		int digit = 0, count = 0, armstrong = 0;
	

	
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			temp = number;
			while (temp > 0) {
				digit = temp % 10;
				temp = temp / 10;
				armstrong = armstrong + (int) Math.pow(digit, count);
			}
			if (armstrong == number)
				System.out.print(armstrong + " ");
		
	}

}

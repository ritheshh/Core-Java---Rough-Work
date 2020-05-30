import java.util.Scanner;

public class GreatestThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = setInputNumber();
		
		if( (number>10_000_00) && (number<99_999_999) ) {
			getGreatestThreeDigitNumber(number);
		}
	}
	
	static long setInputNumber() {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		sc.close();
		return input;		
	}
	
	static void getGreatestThreeDigitNumber(long number) {
		long largestNumber=0;
		while(number != 0) {
			long threeDigitNumber = number%1000;
			largestNumber = threeDigitNumber>largestNumber?threeDigitNumber:largestNumber;
			number /= 10;
		}
		System.out.println(largestNumber);
	}

}

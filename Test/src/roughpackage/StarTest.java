package roughpackage;

import java.util.Scanner;

public class StarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int starsToMove=0;
		for(int i=1; i<=rows; i++) {
			int LastRowStars = i + (i-1);
			if(LastRowStars>rows) {
				starsToMove = starsToMove + (LastRowStars - rows);
			}
		}
		System.out.println(starsToMove);
	}

}

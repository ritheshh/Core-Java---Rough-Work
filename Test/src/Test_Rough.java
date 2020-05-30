import java.util.*;

public class Test_Rough {

	static String tempString = "";
	public static void main(String[] args) {
		
		
		String s1 = "Ram is an athlete";
		String s2 = "Ram is an Indian";
		String s3 = "Kevin is a musician";
		String s4 = "Kevin is an American";
		String s5 = "Ram and Kevin are friends";
		
		printNumber(s1);
		printNumber(s2);
		printNumber(s3);
		printNumber(s4);
		printNumber(s5);
	}
	
	static void printNumber(String str) {
		 
		String tempStringArray[];
		String originalStringArray[];
		

		tempString = tempString + " " + str;
		tempStringArray = tempString.split(" ");
		originalStringArray = str.split(" ");
		
		for(int i=0; i<originalStringArray.length; i++) {
			int count = 0;
			for(int j=0; j<tempStringArray.length; j++) {
				//System.out.println(originalStringArray[i] + " == " + tempStringArray[j]);
				if( originalStringArray[i].equals(tempStringArray[j]) ) 
					count++;	
			}
			System.out.print(count + " ");
		}
		System.out.println();
	}
	
}

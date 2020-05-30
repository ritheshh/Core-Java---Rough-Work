import java.util.*;

public class Test_Rough2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Ram is an athlete";
		String s2 = "Ram is an Indian";
		String s3 = "Kevin is a musician";
		String s4 = "Kevin is an American";
		String s5 = "Ram and Kevin are friends";
		
		String tempString = s1 + " " + s2 + " " + s3 + " " + s4 + " " +  s5;
		String arrayTempString[] = tempString.split(" ");
		
		int frq[] = new int[tempString.length()];
		
		for(int i=0; i<arrayTempString.length; i++) {
			int count = 1;
			for(int j=i-1; j>=0; j--) {
				//System.out.println(arrayTempString[i] + " == " + arrayTempString[j]);
				if( arrayTempString[i].equals(arrayTempString[j]) )
					count++;
			}
			frq[i] = count;
		}
		
		tempString = s1 + " . " + s2 + " . " + s3 + " . " + s4 + " . " +  s5;
		arrayTempString = tempString.split(" ");
		
		for(int i=0,j=0; i<arrayTempString.length; i++) {
			if(arrayTempString[i].equals(".")) {
				System.out.println();
			}
			else {
				System.out.print(frq[j] + " ");
				j++;
			}
		}
		
	}
}

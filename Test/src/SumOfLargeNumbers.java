
public class SumOfLargeNumbers {
	public static void main(String[] args) {

		String s1 = "999";
		String s2 = "111";
		String result = "";
		
		int carry = 0;
		
		int length = Math.min(s1.length(), s2.length());

		for (int i = length - 1; (i>=0)||(carry==1); i--) {
			// System.out.printf("length: %d, i: %d", length, i);
			int num = ( Integer.parseInt(String.valueOf(s1.charAt(i))) + Integer.parseInt(String.valueOf(s2.charAt(i))) + carry);
			if (num < 10) {
				//System.out.println(num);
				result = String.valueOf(num) + result;
				carry = 0;
			} else {
				result = String.valueOf(num%10) + result;
				carry = 1;
			}
		}
		System.out.println(result);
	}
}

package stringconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
	String string;

	public StringMethods() {
		// TODO Auto-generated constructor stub
		string = setString();
		methodsInString();
	}

	String setString() {
		String temp;
		System.out.print("Enter a string:\t");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextLine();
		//sc.close();
		return temp;
	}

	void methodsInString() {
		// toUpperCase() method converts this string into uppercase letters.
		System.out.println("Changing to UPPERCASE: " + string.toUpperCase());

		// toLowerCase() method toLowerCase() method into lowercase letter.
		System.out.println("\nChaning to lowercase: "+ string.toLowerCase());

		// trim() method eliminates white spaces before and after string.
		string = "  " + string + "  ";
		System.out.printf("\n'%s' is trimed using trim() to: %s\n", string, string.trim());
		string = string.trim();

		// startsWith() and endsWith() method returns boolean value if the condition is
		// true.
		System.out.println("\nDoes the string start with \"Hel\"? " + string.startsWith("Hel"));
		System.out.println("\nDoes the string end with \"rld\"? " + string.endsWith("rld"));

		// charAt() method returns a character at specified index.
		if(string.length() > 2)
		System.out.println("\nCharecter at index[2] is: " + string.charAt(2));

		// length() method returns length of the string.
		System.out.println("\nLength of the string is: " + string.length());

		/*
		 * The intern() method should be used on strings constructed with new String()
		 * in order to compare them by == operator. It is faster than equals() method. 
		 */
		String tempStr1 = new String();
		tempStr1 = setString();
		String tempStr2 = tempStr1.intern();
		System.out.println("\nComparing 'tempStr2' with 'string' using " + 
				"'==' operator: " + (tempStr2==string)); // Don't know why is this FLASE ??
		System.out.println("string: " + string + "\ntempStr2: " + tempStr2);

		// valueOf() method converts given type such as int, long, float, double, boolean, char and char array into string.
		int number = 111;
		tempStr1 = String.valueOf(number - 100);
		System.out.println("\ntempStr2 = String.valueOf(number - 100); tempStr2 = " + tempStr1);
		
		// replace() method replaces all occurrence of first parameter with second parameter.
		tempStr1 = "Hello world from java. Have a nice day.";
		tempStr2 = tempStr1.replace("Hello","Jello");
		tempStr2 = tempStr2.replace("nice","jolly");
		System.out.println("\ntempStr1 (string): " + tempStr1 + "\ntempStr2 (replaced string): " + tempStr2);
		
		// replaceAll() replaces every sequence of characters in this string of the given parameter with the second parameter.
		tempStr2 = tempStr1.replaceAll("a", "e");
		System.out.println("\ntempStr2 = tempStr1.replaceAll(\"a\", \"e\"); tempStr2 = " + tempStr2);
		
		// contains() method searches the sequence of characters in this string and returns a boolean value based on the result.
		System.out.println("\ntempStr1.contains(\"java\"): " + tempStr1.contains("java"));
		System.out.println("tempStr2.contains(\"java\"): " + tempStr2.contains("java"));
		
		// format() method returns the formatted string
		System.out.println("\nThe decimal number will be printed with '10' decimal digits and "
				+ "20 spaces to the right: " + String.format("%20.10f", 44.12345));
		System.out.println("Left-justifying within the specified width: " +  String.format("|%-10d|", 444));
		System.out.println("Right-justifying within the specified width: " +  String.format("|%10d|", 444));
		System.out.println("Filling with zeroes: " +  String.format("|%010d|", 444));
		
		// toCharArray()
		char charArray[] = tempStr1.toCharArray();
		System.out.println("\ntempStr1.toCharArray(); charArray: " + Arrays.toString(charArray));
		
		// getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
		char chars[] = new char[tempStr1.length()];
		try {
			tempStr1.getChars(0, tempStr1.length(), chars, 0);
			System.out.println("\ngetChars(): " + Arrays.toString(chars));
		} catch(Exception e) {
			System.out.println("Exception " + e);
		}
		
		// isEmpty() method checks for empty string and returns TRUE if the string is empty.
		tempStr2 = "";
		System.out.println("\nCheck if tempStr2 isEmpty(): " + tempStr2.isEmpty());
		
		// getBytes()
		byte byteArray[] = tempStr1.getBytes();
		System.out.println("\ntempStr1.getBytes(); byteArray: " + Arrays.toString(byteArray));
		
		/*
		 * substring(int startIndex);
		 * substring(int startIndex, int endIndex);
		 */		
		System.out.println("\nsubstring() with endIndex: " + tempStr1.substring(2,10));
		System.out.println("substring() with NO endIndex: " + tempStr1.substring(2));
		
		// indexOf() methods searches the sequence of characters in the string and returns an Integer value of the index.
		System.out.println("\nIndex of \"world\": " + tempStr1.indexOf("world"));
		System.out.println("\nIndex of \"world\" from index 10: " + tempStr1.indexOf("world", 10)); // returns -1 as it failed to match.
		
		// lastIndexOf() method returns last index of the given character value or substring.
		System.out.println("\nLast index of 'a': " + tempStr1.lastIndexOf('a'));
		System.out.println("\nLast index of 'a' from index 10: " + tempStr1.lastIndexOf('a', 10));
		
		// join() method returns a string joined with given delimiter.
		tempStr2 = String.join(".","this", " is", " index", " of", " example");
		System.out.println("\n'.' is used as delimeter: " + tempStr2);
		tempStr2 = String.join("-", "18", "03", "2020");
		System.out.println("'-' is used as delimeter: " + tempStr2);
		
		/*
		 * split() method splits this string against given regular expression and
		 * returns a char array. split(String regex) (or) split(String regex, int limit)
		 * limit : limit for the number of strings in array. If it is zero, it will
		 * returns all the strings matching regex.
		 */
		System.out.println("\nString before splitting, tempStr1: " + tempStr1);
		String ArrayString[] = tempStr1.split(" ");
		System.out.println("ArrayString: " + Arrays.toString(ArrayString));

	}
}

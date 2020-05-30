package roughpackage;

public class CountTest {

	public static void main(String[] args) {
		String input = "yyyzzzzyz";
		char[] charArray = input.toCharArray();

		int highestLetterCount = 0;
		char highestLetter = '\u1000';

		for (int i = 0; i < charArray.length; i++) {
			int count = 1;
			if (charArray[i] != '0') {
				for (int j = i + 1; j < charArray.length; j++) {
					if (charArray[j] != '0') {
						if (charArray[i] == charArray[j]) {
							count++;
							charArray[j] = '0';
						}
						if (highestLetterCount <= count) {						
							highestLetter = highestLetterCount == count
									? (charArray[i] < highestLetter ? charArray[i] : highestLetter)
									: charArray[i];
									
							highestLetterCount = count;
						}
					}
				}
			}
		}

		System.out.println(highestLetter + " " + highestLetterCount);
	}

}

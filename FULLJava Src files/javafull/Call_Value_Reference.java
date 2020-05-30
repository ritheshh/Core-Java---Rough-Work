package javafull;

class ReferenceTest {
	int value=10;
}

public class Call_Value_Reference {

	Call_Value_Reference() {
		System.out.println("JAVA: CALL BY VALUE OR REFERENCE?");
		ReferenceTest obj = new ReferenceTest();
		
		printNum(obj.value);
		changeNum(obj.value);
//		The value of the number did not change.
		System.out.println("\nThe value remains the same as it was passed as value; "
				+ "Number= " + obj.value);

		changeNum(obj);
		System.out.println("\nNow, object which is also passed as value "
				+ "but it is the copy of reference. Number = " + obj.value);

	}

	void printNum(int value) {
		System.out.println("Value of Number is " + value);
	}

	void changeNum(int value) {
		value = 33;
	}

	void changeNum(ReferenceTest referenceCopy) {
		referenceCopy.value = 33;
	}
}

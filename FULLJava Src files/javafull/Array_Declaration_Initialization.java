package javafull;

import java.util.Arrays;

public class Array_Declaration_Initialization {
	Array_Declaration_Initialization() {
		/*
		 * Array declaration: type var-name[]; only a reference of array is created. To
		 * actually create or give memory to array, you use 'new' keyword, which also
		 * automatically initiallizes the elements in the array to zero or null. Array
		 * initialization: var-name = new type [size];
		 */
		int array[] = new int[10];

//	Array Literal: where the size of the array and variables of array are already known.
		int literalArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < array.length; i++) {
			array[i] = literalArray[i];
		}
		System.out.println(Arrays.toString(array));
	}
}

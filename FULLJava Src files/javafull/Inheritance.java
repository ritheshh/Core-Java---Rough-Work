package javafull;

import java.util.Scanner;

public class Inheritance {
	/*
	 * Reusability of code is the main purpose. 'Is-a' relation between the classes
	 * Types: Single, Multi-level, Hierarchical, Multiple, Hybrid inheritance.
	 */
	Atmosphere obj = new Atmosphere();

	Inheritance() {
		obj.printTemperature();
		System.out.println("\nChanging the temperature to '10' using the " + "object of subclass 'Atmosphere'");
		obj.temperature = 10;
		obj.printTemperature();
		System.out.print("\n Learn more about Inheritance:"
				+ "\n1. Multi_level & Hierarchical Inheritance \n2. Multiple Inhertance \n3. Hybrid Inheritance"
				+ "\nLesson you want to learn:\t");

		Scanner scanner = new Scanner(System.in);
		int lesson = scanner.nextInt();

		switch (lesson) {
		case 1:
			new Multi_Hierarchical_Inhertance();
			break;
		case 2:
			new Multiple_Inheritance();
			break;
		case 3:
			System.out.println("HYBRID INTERFACES: Its a mix of two or more types of inheritance.");
			break;
		default:
			System.out.println("EXIT");
			break;
		}
	}
}

class Earth {
	int temperature;

	Earth() {
		this.temperature = 5;
	}
}

class Atmosphere extends Earth {
	void printTemperature() {
		System.out.println("Atmospheric temperature of the Earth is: " + super.temperature);
	}
}

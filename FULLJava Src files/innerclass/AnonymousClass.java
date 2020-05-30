package innerclass;

class ClassEngine {
	void printEngineOilCapacity() {
	}
}

interface Engine {
	void printOilCapacity();
}

interface PriceOfCar {
	void printPrice();
}

public class AnonymousClass {
	public static void main(String[] args) {
		ClassEngine obj = new ClassEngine() {
			@Override
			void printEngineOilCapacity() {
				System.out.println("Capacity of the Engine is 1200 litres.");
			}
			// Now the printEngineOilCapacity() is defined in an AnonymousClass.
		};
		obj.printEngineOilCapacity();

		Engine objEngine = new Engine() {
			@Override
			public void printOilCapacity() {
				System.out.println("AnonymousClass-Interface: AnCapacity of the Engine is 1200 litres.");
			}
		};
		objEngine.printOilCapacity();

		PriceOfCar price = () -> System.out.println("Lamda Expression-Interface: Price of the car is $10,000");
		//Lamda Expressions will only work for interfaces that has a single method declared in it.
		price.printPrice();
	}
}

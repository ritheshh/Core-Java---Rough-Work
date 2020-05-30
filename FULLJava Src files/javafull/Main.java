package javafull;

import java.util.Scanner;
import exceptionhandling.*;
import stringconcepts.*;
import serialization.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1.Encapsulation. \n2.Inheritance. \n3.Overloading. \n4.Overriding. "
				+ "\n5.Default Initialization Of Instance Variable. \n6.Arrays Declaration and Initialization. "
				+ "\n7.Java: call by Value or Reference? \n8.Static block. \n9.Wrapper Class. "
				+ "\n10.Primitive & type-casting. \n11.Abstract Class. \n12.Interface. "
				+ "\n13.Variable argument list in methods. \n14.Constructor and Constructor overloading. "
				+ "\n15.Variables. \n16.Operator. \n17.Control Flow. "
				+ "\n18.Exception handling. \n19.Assertion. \n20.String. \n21.Serialization. \n22.Deserialization \n23.JODA Time \n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the lesson number: \t");
		int lesson = scanner.nextInt();
		//scanner.close();
		System.out.printf("\n\n");

		switch (lesson) {
		case 1:
			Encapsulation encapObj = new Encapsulation();
			encapObj.setEmpName("Rithesh");
			encapObj.setEmpId(108506);
			System.out.println("Employee Name: " + encapObj.getEmpName() + "\nEmployee Id: " 
			+ encapObj.getEmpId());
			break;
		case 2:
			new Inheritance();
			break;
		case 3:
			new Overloading();
			break;
		case 4:
			new Overriding();
			break;
		case 5:
			new Default_Initialization_Instance_Variable();
			break;
		case 6:
			new Array_Declaration_Initialization();
			break;
		case 7:
			new Call_Value_Reference();
			break;
		case 8:
			new Blocks(); //Static Blocks
			break;
		case 9:
			WrapperClass wcObj = new WrapperClass();
			wcObj.autoboxing();
			wcObj.unboxing();
			break;
		case 10:
			new PrimitiveDataTypes();
			break;
		case 11:
			new AbstractClass();
			break;
		case 12:
			new InterfaceClass();
			break;
		case 13:
			new VariableArgumentList();
			break;
		case 14:
			new Constructor(10,20); //Calling constructor with TWO arguments - constructor overloading.
			break;
		case 15:
			new Variables();
			break;
		case 16:
			new Operator(10, 20);
			break;
		case 17:
			new ControlFlow();
			break;
		case 18:
			new ExceptionHandling();
			break;
		case 19:
			new exceptionhandling.Assertions();
			break;
		case 20:
			new MainStringClass();
			break;
		case 21:
			new serialization.SerializationClass();
			break;
		case 22:
			new serialization.DeSerializationClass();
			break;
		case 23:
			//new jodatime.MainJodaTimeClass();
			break;
		default:
			System.out.println("No lesson available. EXIT");
			break;
		}
	}
}
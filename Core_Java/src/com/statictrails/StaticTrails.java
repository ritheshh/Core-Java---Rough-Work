package com.statictrails;

import com.statictrails.SuperClass.NormalSubClass;

class A {
	static int varA;
	static String stringA;
	
	static int setVarA(int num) {
		return num;
	}
}


class SuperClass {
	
	class NormalSubClass {
		public NormalSubClass() {
			System.out.println("This is a normal inner class!! Object of the outer class is required to create this class");
		}
	}
	
	static class StaticSubClass {
		public StaticSubClass() {
			System.out.println("This is a static inner class!!");
		}
	}
}

public class StaticTrails {
	
	public static void main(String[] args) {
		setValues();
		System.out.println(A.varA + " " + A.stringA);
		SuperClass obj = new SuperClass();
		SuperClass.NormalSubClass objNSC = obj.new NormalSubClass();
		
		SuperClass.StaticSubClass objSCC = new SuperClass.StaticSubClass();
	}
	
	 public static boolean setValues() {
		System.out.println("Hit here");
		A.varA = A.setVarA(19);
		A.stringA = System.console().readLine();
		// Static methods and variables can be accessed for non-static ones!!
		return true;
	}
}

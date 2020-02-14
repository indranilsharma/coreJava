package com.operators.instanceofOperator;

//You cannot use a java.lang.Class object reference.

public class Manager4 {
	public static void main(String[] argv) {
		MyClass myObject = new MyClass();
		MyAnotherClass myObject2 = new MyAnotherClass();

		// if (myObject instanceof java.lang.Class) {
		// Incompatible
		// conditional operand types MyClass and Class

		System.out.println("myobject is an instance of MyAnotherClass");
		// }

	}
}

class MyClass2 {

}

class MyAnotherClass2 extends MyClass2 {
}

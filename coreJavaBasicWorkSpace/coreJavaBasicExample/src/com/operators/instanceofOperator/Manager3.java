package com.operators.instanceofOperator;

//Using instanceof operator in class hierarchy : instanceof Operator

public class Manager3 {
	public static void main(String[] argv) {
		MyClass myObject = new MyClass();

		if (myObject instanceof MyAnotherClass1) {
			System.out.println("myobject is an instance of MyAnotherClass");
		}

	}
}

class MyClass1 {

}

class MyAnotherClass1 extends MyClass {
}

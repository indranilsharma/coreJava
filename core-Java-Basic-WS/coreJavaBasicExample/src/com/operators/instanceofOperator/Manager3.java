package com.operators.instanceofOperator;

//Using instanceof operator in class hierarchy : instanceof Operator

class MyClass1 {

}

class MyAnotherClass1 extends MyClass1 {
}

public class Manager3 {
	public static void main(String[] argv) {

		MyClass1 myObject = new MyClass1();
		MyClass1 obj = new MyAnotherClass1();

		if (myObject instanceof MyAnotherClass1) {
			System.out.println("myobject is an instance of MyAnotherClass");
		} else if (obj instanceof MyClass1) {
			System.out.println("obj is an instance of MyAnotherClass ");
		} else {
			System.out.println("somthing else");
		}
	}
}

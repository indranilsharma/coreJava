package com.operators.instanceofOperator;

interface MyInterface {

	public void myMethod();
}

class MyClass7 implements MyInterface {

	@Override
	public void myMethod() {
		System.out.println("Myclass-7");
	}

}
/*
 * The right operand of instanceof may be an interface: instanceof Operator
 * instanceof is a keyword that is used for checking if a reference variable is containing a 
 * given type of object reference or not.
 */
public class Manager6 {
	public static void main(String[] argv) {
	
		MyClass7 myObject = new MyClass7();

		if (myObject instanceof MyInterface) {
			System.out.println("myobject is an instance of MyInterface");
		}
		else{
			System.out.println("no");
		}

	}
}

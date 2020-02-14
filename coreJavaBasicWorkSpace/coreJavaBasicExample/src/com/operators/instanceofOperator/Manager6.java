package com.operators.instanceofOperator;

/*The right operand of instanceof may be an 
  interface: instanceof Operator
*/
public class Manager6 {
	public static void main(String[] argv) {
		MyClass7 myObject = new MyClass7();

		if (myObject instanceof MyInterface) {
			System.out.println("myobject is an instance of MyInterface");
		}

	}
}

interface MyInterface {

	public void myMethod();
}

class MyClass7 implements MyInterface {

	public void myMethod() {
	}

}
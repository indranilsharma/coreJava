
package com.operators.comparisonoperators;

/*
The short-circuit logical operators && and || 
&& short-circuit AND || 
*/
public class Manager6 {
	public static void main(String[] argv) {

		MyClass myObject = new MyClass();
		MyClass myObject2 = new MyClass();
		if (myObject == myObject2) {
			System.out.println("==");
		}
		else {
			System.out.println("Else");
		}

	}
}

class MyClass {

}

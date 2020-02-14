package com.classesMethodsVariable.Variable.instanceVariable;

/*
 * non static instance variables are initialized before the class constructor is executed
*/

class MyClassCall {
	int x = 20;

	MyClassCall() {
		System.out.println(x);
	}
}

public class Manager5 {
	public static void main(String[] argv) {
		new MyClassCall();
	}
}

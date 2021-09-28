package com.classesMethodsVariable.Variable.instanceVariable;

/*A member variable is created when a class instance is created, 
and it is destroyed when the object is destroyed.*/

public class Manager1 {
	private int fieldVariable = 0;

	public static void main(String[] argv) {
		Manager1 manager1 = new Manager1();
		System.out.println(manager1.fieldVariable);
		// System.out.println(fieldVariable);//can't able to access here.
	}

}
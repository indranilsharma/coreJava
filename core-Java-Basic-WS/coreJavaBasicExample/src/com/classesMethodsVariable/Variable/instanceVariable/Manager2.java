package com.classesMethodsVariable.Variable.instanceVariable;

/*Field variables are variables that are declared as members of a class. 
Field variables are variables that are declared as members of a class. 
*/

public class Manager2 {
	private int fieldVariable;

	public static void main(String[] argv) {
	
		Manager2 manager2 = new Manager2();
		int localVariable = 0;
		//System.out.println(fieldVariable);//tha's why we called objct level variable
		System.out.println(manager2.fieldVariable);
		System.out.println(localVariable);//with out obj we can able to access
	}
}

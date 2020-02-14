package com.classesMethodsVariable.Variable.variableScope;

//Attempting to use a block variable after the code block has completed.
public class Manager4 {
	public static void main(String[] argv) {
		aMethod();
	}

	static void aMethod() {
		for (int z = 0; z < 5; z++) {
			boolean test = false;
			if (z == 3) {
				test = true;
				break;
			}
		}
		// System.out.print(test); // 'test' is an ex-variable,
		// it has ceased to be...
	}
}

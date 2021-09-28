package com.classesMethodsVariable.Variable.variableScope;

//Attempting to access a local variable from a nested method

public class Manager3 {

	void go() {
		int y = 5;
		go2();
		y++; // once go2() completes, y is back in scope
	}

	void go2() {
		// y++; // won't compile, y is local to go()
	}

	public static void main(String[] args) {
		Manager3 s = new Manager3();
		s.go();
	}
}

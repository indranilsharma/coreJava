package com.classesMethodsVariable.Variable.localVariable;

//local variables can be marked final
public class Manager2 {
	public void logIn() {
		final int count = 10; //only permitable modifier for local variable
		//count =11; //final cant be change
		System.out.println(count);
	}
	public static void main(String[] args) {
		Manager2 manager2=new Manager2();
		manager2.logIn();
	}
}

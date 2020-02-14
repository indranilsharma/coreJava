package com.java8newfeature.common.lamdaExpretion;

interface A {
	void show();
}

class Middle implements A {

	@Override
	public void show() {
		System.out.println("I am implemented from middle");
	}
}

public class LamdaWithOut {
	public static void main(String[] args) {
		
		//just for only access one method i have to create one class
		// A obj = new Middle();

		A obj = new A() {

			@Override
			public void show() {
				System.out.println("I am implemented from anonaousmos inner class");
			}
		};
		obj.show();
	}

}

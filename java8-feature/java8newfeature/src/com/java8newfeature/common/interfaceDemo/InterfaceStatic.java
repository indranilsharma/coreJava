package com.java8newfeature.common.interfaceDemo;

interface DefaultStatic {

	default void iamDefault() {
		System.out.println("iamDefault new to jdk1.8");
	}

	void abstractDemo();

	static void iamStatic() {
		System.out.println("istatic new to jdk1.8");

	}
}

class InterfaceMiddleSatic implements DefaultStatic {

	@Override
	public void abstractDemo() {
		System.out.println("i am abstract that is why must be implemented ");
	}
}

public class InterfaceStatic {

	public static void main(String[] args) {

		InterfaceMiddleSatic obj = new InterfaceMiddleSatic();
		obj.abstractDemo();
		obj.iamDefault();
		DefaultStatic.iamStatic();
	}

}
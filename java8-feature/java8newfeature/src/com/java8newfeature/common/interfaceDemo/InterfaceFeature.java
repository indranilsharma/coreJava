package com.java8newfeature.common.interfaceDemo;

interface DefaultDemo {

	// interface can't have the constructor
	// public DefaultDemo(){}

	default void iamDefault() {
		System.out.println("iamDefault new to jdk1.8");
	}

	public static final int i = 0;

	default void iamDefaultSec() {
		System.out.println("iamDefault new to jdk1.8");
	}

	void abstractDemo();
}

class InterfaceMiddle implements DefaultDemo {
	@Override
	public void abstractDemo() {
		System.out.println("i am abstract that is why must be implemented ");
	}

}

public class InterfaceFeature {

	public static void main(String[] args) {

		InterfaceMiddle middle = new InterfaceMiddle();
		middle.abstractDemo();
		middle.iamDefault();
		middle.iamDefaultSec();

	}

}

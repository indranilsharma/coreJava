package com.opps.constractor;

public class ConstructorChaining {

	public ConstructorChaining() {
		System.out.println("no-arg");
	}

	public ConstructorChaining(String s) {
		this(10,1.1f);
		System.out.println("ConstructorChaining(String s)");
	}

	public ConstructorChaining(int i, float f) {
		this();
		System.out.println("ConstructorChaining(int i,float f)");
	}

	public static void main(String[] args) {
           new ConstructorChaining("india");
	}

}

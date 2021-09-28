package com.opps.constractor;

class Base {
	/*
	 * Similar to constructor chaining in same class, super() should be the
	 * first line of the constructor as super class’s constructor are invoked
	 * before the sub class’s constructor.
	 */	
	Base() {
		System.out.println("base");
	}
}

class Derived extends Base{
	Derived() {
		super();
		System.out.println("Derived");
	}
	
	Derived(int i) {
		System.out.println("Derived");
	}
	
}

public class ConstructorChainingSuper {

	public static void main(String[] args) {
       new Derived(10);
	}

}

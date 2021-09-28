package com.allKeyword.abstrac.method_class;

abstract class Base {

	abstract void display();

	// constructor call when the derived class instance created
	public Base() {
		System.out.println("cons");
	}

	public final void demo() {
		System.out.println("final");
	}
	public void print() {
		System.out.println("concreate method");
	}
}

class Derived extends Base {

	@Override
	void display() {
		System.out.println("abstract method");
	}
}

public class Test {

	public static void main(String[] args) {

		// abstruct class cant be instanciated
		// Base obj1 = new Base();

		Base obj = new Derived();
		obj.display();
		obj.demo();//only call not override
	}
}

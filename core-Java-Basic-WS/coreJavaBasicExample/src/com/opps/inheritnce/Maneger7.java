package com.opps.inheritnce;

/* Although a final method cannot be overridden, 
in this case, the method is private, and therefore hidden. The effect is that a new, accessible,*/

class A3 {
	// this method will hide
	private final void print() {
		System.out.println("A3 -Private");
	}
}

class B3 {

	// method will show
	public final void print() {
		System.out.println("B3 -public");
	}
}

public class Maneger7 {

	public static void main(String[] args) {
		new B3().print();
	}

}

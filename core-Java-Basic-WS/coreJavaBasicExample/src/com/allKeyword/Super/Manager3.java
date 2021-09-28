package com.allKeyword.Super;

class SuperClass {
	String s = "base";

	void display(String s) {
		System.out.println("super: " + s);
	}
}

class ThisSuper extends SuperClass {
	String s = "derived";

	ThisSuper() {
		display(this.s);
		display(super.s);
		this.display(s);
		super.display(s);
	}

	void display(String s) {
		System.out.println("this: " + s);
	}
}

public class Manager3 {
	public static void main(String[] argv) {
		new ThisSuper();

	}
}
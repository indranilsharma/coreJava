package com.allKeyword.Static.Method;

public class SuperThis {

	static int i = 10;

	// instance method
	int j = 20;

	public static void print() {

		System.out.println("static method " + i);

		i = 50;// reassign static

		// j=100; //can't access non static from static
		// display(); //can't access non static from static

		System.out.println("static method " + i);

		// from static super cant able to access
		// System.out.println(super.getClass());
	}

	// from static non-static access not possible but from non-static static
	// acces possible
	public void display() {

		System.out.println(i);// static access
		print();// static access

		System.out.println("non-static method " + j);
		j = 100;
		System.out.println("non-static method " + j);
		System.out.println(super.getClass());
		System.out.println(this.getClass());
	}

	public static void main(String[] args) {
		System.out.println("main");
		print();// static call
		new SuperThis().display();// non static call
	}

}

package com.opps.inheritnce;

class I {

	I() {
		// this(10);
		System.out.println("I()");
	}

	// IIB
	{
		System.out.println("I IIB 1");
	}

	// static block
	static {
		System.out.println("I SIB");
	}

	I(int i) {
		this();
		System.out.println("I(int i)");
	}
}

class K extends I {

	K() {
		this(10); //attaech  with currrent class constuctor
		System.out.println("K()");
	}

	{
		System.out.println("K IIB 1");
	}

	static {
		System.out.println("K SIB");
	}

	K(int i) {
		super(i);
		System.out.println("K(int i)");
	}

	{
		System.out.println("K IIB 2");
	}
}

class L extends K {

	public L() {
		this(10);
		System.out.println("L()");
	}

	{
		System.out.println("L IIB 1");
	}

	static {
		System.out.println("L SIB");
	}

	L(int i) {
		super(90);
		System.out.println("L(int i)");
	}

	{
		System.out.println("L IIB 2");
	}
}

public class Manager5 {

	static {
		System.out.println("Manager5 SIB 2");
	}

	public static void main(String[] args) {
		new I();
		System.out.println("==================================");
		new K();
		System.out.println("==================================");
		new L();
		System.out.println("==================================");
		new I(20);
		System.out.println("==================================");
		new K(40);
		System.out.println("==================================");
		new L(80);
	}
}

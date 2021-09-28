
package com.allKeyword.IIB;

public class Manager1 {

	static byte b;

	// static block
	static {
		System.out.println("SIB 2");
	}
	// static block
	static {
		System.out.println("SIB 1");
	}

	// IIB
	{
		System.out.println("IIB 1");
	}

	// IIB
	{
		System.out.println("IIB 2");
	}

	public Manager1() {
		System.out.println(b);
		System.out.println("M()");
	}

	public Manager1(boolean b, int i) {
		this();
		System.out.println(b);
		System.out.println("M(boolean b,int i)" + b + "," + i);
	}

	public Manager1(float f, String s) {
		this(false, 200);
		System.out.println(b);

		System.out.println("M(float f,String s)" + f + "," + s);

	}

	public static void main(String[] args) {
		new Manager1();
		System.out.println("...............");
		new Manager1(true, 100);
		System.out.println("...............");
		new Manager1(100.2f, "india");
		System.out.println("...............");

	}
}

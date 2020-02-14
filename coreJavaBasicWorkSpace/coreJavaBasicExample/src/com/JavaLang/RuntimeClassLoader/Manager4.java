package com.JavaLang.RuntimeClassLoader;

/*
Returns {@code true} if and only if the underlying class
is a local class.*/

class X2 {

	int a;

	double b;

}

class Y2 extends X {

	int c;

}

public class Manager4 {
	public static void main(String args[]) {

		X2 a = new X2();

		Y2 b = new Y2();

		Class obj;

		obj = b.getClass();

		System.out.print(obj.isLocalClass());

	}
}
package com.CollectionFramework.generics;

class C<A, B> {
	A i, j;
	B m, n;
	String p, q;
}

public class Manager3 {
	public static void main(String[] args) {

		C<String, String> obj = new C<String, String>();

		obj.i = "india";
		obj.j = "asia";
		obj.m = "usa";
		obj.n = "kolkata";
		obj.p = "bangalore";
		obj.q = "marathalli";

		C<Integer, String> obj1 = new C<Integer, String>();
		obj1.i = 500;
		obj1.j = 1000;
		obj1.m = "india";
		obj1.n = "rome";
		obj1.p = "john";
		obj1.q = "jack";

		System.out.println("done");
	}
}

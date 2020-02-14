package com.CollectionFramework.generics;

class B<X> {
	String s;
	X i;
}

public class Manager2 {
	public static void main(String[] args) {

		B<String> obj = new B<String>();

		obj.s = "india";
		obj.i = "asia";

		B<Integer> obj1 = new B<Integer>();
		obj1.i = 500;
		obj1.s = "rome";

		B<Double> obj2 = new B<Double>();
		obj2.i = 22.2;
		obj2.s = "usa";

		B<Float> obj3 = new B<Float>();
		obj3.i = (float) 5.5;
		obj3.s = "Behala";

		/*
		 * System.out.println(obj.toString());
		 * System.out.println(obj1.toString());
		 * System.out.println(obj2.toString());
		 * System.out.println(obj3.toString());
		 */

		System.out.println("done");
	}
}

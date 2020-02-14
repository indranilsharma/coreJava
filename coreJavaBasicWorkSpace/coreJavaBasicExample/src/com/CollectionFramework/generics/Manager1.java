package com.CollectionFramework.generics;

class A<X> {
	X i;
}

public class Manager1 {
	public static void main(String[] args) {
		A<String> obj = new A<String>();
		obj.i = "india";
		A<Integer> obj1 = new A<Integer>();
		obj1.i = 500;
		A<Double> obj2 = new A<Double>();
		obj2.i = 22.2;
		A<Float> obj3 = new A<Float>();
		obj3.i = (float) 5.5;
		/*System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());*/
		System.out.println("done");
	}
}

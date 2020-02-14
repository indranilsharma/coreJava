package com.CollectionFramework.generics;

class E1<X> {
	X i;

	public E1() {
		System.out.println("default");
	}

	public E1(X i) {
		this.i = i;
		System.out.println("parameterised");
	}

	public X getI() {
		return i;
	}

	public void setI(X i) {
		this.i = i;
	}

}

public class Manager7 {
	public static void main(String[] args) {
		E1<Integer> obj = new E1<Integer>();
		obj.setI(20);
		int i = obj.getI();
		E1<String> obj1 = new E1<String>("jonney");
		String s = obj1.getI();
		System.out.println(i+"   "+s);
	}
}

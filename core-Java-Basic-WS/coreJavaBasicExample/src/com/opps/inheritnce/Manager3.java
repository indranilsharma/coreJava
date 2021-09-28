package com.opps.inheritnce;

class D {

	D() {
		System.out.println("D()");
	}
}

class E extends D {

	E() {
		System.out.println("E()");
	}
}

public class Manager3 {

	public static void main(String[] args) {
		
		D d = new D();
		System.out.println("..........");
		
		E e = new E(); //print base and derived constructor
		System.out.println("...........");
	}
}

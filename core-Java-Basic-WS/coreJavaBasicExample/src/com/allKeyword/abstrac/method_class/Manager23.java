package com.allKeyword.abstrac.method_class;

abstract class Manager25 {
	Manager25() {
		System.out.println("cons manager25()");
	}
}

public class Manager23 extends Manager25 {

	public Manager23() {
		System.out.println("cons manage23");
	}

	public static void main(String[] args) {
		new Manager23();
		System.out.println("done");
	}
}

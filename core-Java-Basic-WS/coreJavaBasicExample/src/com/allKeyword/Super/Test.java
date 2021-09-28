package com.allKeyword.Super;

 class Manager4 {
	Manager4() {
		System.out.println("Manager4()");
	}

	Manager4(int i) {
		System.out.println("Manager4(int i)");
	}
}

class Manager5 extends Manager4 {

	Manager5() {
		super(10);
		System.out.println("Manager5()");
	}

	Manager5(int i) {
		super();
		System.out.println("Manager5(int)");
	}
}

public class Test{
	public static void main(String[] args) {
		new Manager5();
		System.out.println(".......");
		new Manager5(10);
		System.out.println("..........");
		new Manager4(100);
		System.out.println("..........");
		new Manager4();
		System.out.println(".........");

	}
}
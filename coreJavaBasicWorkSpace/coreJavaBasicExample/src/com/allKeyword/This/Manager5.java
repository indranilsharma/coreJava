package com.allKeyword.This;

class Manager5 {

	Manager5() {
		System.out.println("Manager5()");
	}

	Manager5(int i) {
		// Manager5();
		System.out.println("Manager5()");
		//constractor call shiuld be first statment
	}

	public static void main(String[] args) {
		Manager5 manager5 = new Manager5();
		System.out.println(".........");
		Manager5 manager52 = new Manager5(10);
		System.out.println("..........");
	}
}

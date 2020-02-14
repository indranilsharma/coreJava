package com.allKeyword.This;

class Manager4 {
	Manager4() {
		System.out.println("Manager4()");
	}

	Manager4(int i) {
		System.out.println("Manager4()");
		// this(); //constractor call shiuld be first statment
	}

	public static void main(String[] args) {
		Manager4 manager4 = new Manager4();
		System.out.println(".........");
		Manager4 manager42 = new Manager4();
		System.out.println("..........");
	}
}

package com.allKeyword.This;

class Manager7 {

	Manager7() {
		System.out.println("Manager6()");
	}

	Manager7(int i) {
		Manager6 manager6 = new Manager6();
		System.out.println("Manager6(int)");
		
	}

	public static void main(String[] args) {
		Manager6 manager6 = new Manager6();
		System.out.println(".........");
		Manager6 manager52 = new Manager6(10);
		System.out.println("..........");
	}
}

package com.allKeyword.This;

class Manager8 {

	Manager8() {
		this(10);
		System.out.println("Manager8()");
	}

	Manager8(int i) {
		//this(); //recursive
		Manager8 manager8 = new Manager8();
		System.out.println("Manager8(int)");
		
	}

	public static void main(String[] args) {
		Manager8 manager8 = new Manager8();
		System.out.println(".........");
		Manager8 manager82 = new Manager8(10);
		System.out.println("..........");
	}
}

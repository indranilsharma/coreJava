package com.allKeyword.This;

//here we can see the preference of execution

class Manager13 {
	
	{
		System.out.println("IIB-1");
	}
	
	Manager13() {
		this(10);
		System.out.println("Manager13()");

	}
	
	Manager13(int i) {

		System.out.println("Manager13(int i)");

	}

	public static void main(String[] args) {
		Manager13 obj1 = new Manager13();
		System.out.println("...............");
		Manager13 obj2 = new Manager13(0);
		System.out.println("...............");
	}
}

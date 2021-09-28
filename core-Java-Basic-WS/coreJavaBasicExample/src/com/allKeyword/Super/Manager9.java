package com.allKeyword.Super;

public class Manager9 {
	Manager9() {
		System.out.println(super.getClass()); // object class hashcode 366712642
		System.out.println("Manager9()");
		
	}

	Manager9(int i) {
//		super();
		this.getClass();
//		this();//current class hashcode
		System.out.println("Manager9(int)");
	}

	public static void main(String[] args) {

		new Manager9();
		System.out.println(".......");
		new Manager9(10);
        
	}
}

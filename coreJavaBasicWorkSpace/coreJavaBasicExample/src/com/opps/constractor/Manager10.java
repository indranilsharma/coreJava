package com.opps.constractor;

public class Manager10 {
	Manager10() {
		System.out.println("Manager10()");
	}

	Manager10(int i) {
		System.out.println("Manager10(int)");
	}

	public static void main(String[] args) {
     Manager10 obj= new Manager10();
     System.out.println("default cos");

     Manager10 obj1= new Manager10(10);
     System.out.println("parameter cos");
	}
}
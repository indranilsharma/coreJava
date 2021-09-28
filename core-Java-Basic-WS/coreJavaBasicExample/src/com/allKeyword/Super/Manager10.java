package com.allKeyword.Super;

class Car {
	int speed = 5;

	public void print() {
		System.out.println("car-speed :" + speed);
	}
}

class Bycycle extends Car {
	int speed = 1;

	public void print() {
		super.print();
		System.out.println("bycle-speed :" + speed);
	}
}

public class Manager10 {

	public static void main(String[] args) {
		Bycycle obj = new Bycycle();
		obj.print();
	}
}

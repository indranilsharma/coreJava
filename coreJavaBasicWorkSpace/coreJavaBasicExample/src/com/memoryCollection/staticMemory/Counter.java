package com.memoryCollection.staticMemory;

class Manager9 {
	static int count = 0; // will get memory only once

	Manager9() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {
		Manager9 c1 = new Manager9();
		Manager9 c2 = new Manager9();
		Manager9 c3 = new Manager9();
	}
}
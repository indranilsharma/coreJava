package com.opps.constractor;

public class Manager11 {
	static {
		System.out.println("SIB");
	}

	public Manager11() {
		System.out.println("Manager()");
	}

	public static void main(String[] args) {
		Manager11 manager11 = new Manager11();
		System.out.println("........");
		Manager11 managerobj = new Manager11();

	}
}

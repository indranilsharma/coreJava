package com.opps.constractor;

//here we can see the preference of execution

class Manager14 {
	public Manager14() {
		System.out.println("Manager14()");
	}

	{
		System.out.println("IIB-1");
	}

	static {
		System.out.println("SIB-1");
	}

	public static void main(String[] args) {
		new Manager14();
		System.out.println("...............");
	}
}

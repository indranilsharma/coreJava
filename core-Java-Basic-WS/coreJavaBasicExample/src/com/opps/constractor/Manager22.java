package com.opps.constractor;

class Manager25 {
	{
		System.out.println("Manager25-IIB-1");
	}

	{
		System.out.println("Manager25-IIB-2");
	}

	public Manager25() {
		System.out.println("Manager25()");
	}
}

class Manager23 extends Manager25 {
	Manager23() {
		System.out.println("Manager23()");
	}
}

public class Manager22 extends Manager23 {

	{
		System.out.println("Manager22-IIB-1");
	}

	Manager22() {
		this(10);
		// super(10, 20);
		System.out.println("Manager21()");
	}

	Manager22(int i) {
		System.out.println("Manager21(int i)");
	}

	public static void main(String[] args) {
		new Manager25();
		System.out.println(".......");
		new Manager23();
		System.out.println(".......");
		new Manager22();
		System.out.println(".......");
		new Manager22(10);
		System.out.println(".......");
	}
}
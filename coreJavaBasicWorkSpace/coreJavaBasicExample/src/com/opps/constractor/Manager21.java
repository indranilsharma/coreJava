package com.opps.constractor;

class Manager20 {
	Manager20(int i) {
		System.out.println("Manager20(int i)");
	}

	{
		System.out.println("Manager20-IIB-1");
	}

	Manager20(int i, int j) {
		this(j);
		System.out.println("Manager20(int i,int j)");
	}
}

public class Manager21 extends Manager20 {
	Manager21() {
		super(10, 20);
		System.out.println("Manager21()");
	}

	{
		System.out.println("Manager21-IIB");
	}

	Manager21(int i) {
		this();
		System.out.println("Manager21(int i)");
	}

	Manager21(double i) {
		super(10);
		System.out.println("Manager21(double)");
	}

	public static void main(String[] args) {
		Manager20 obj1 = new Manager20(10);
		System.out.println(".......");
		Manager20 obj2 = new Manager20(10, 20);
		System.out.println(".......");
		Manager21 obj3 = new Manager21();
		System.out.println(".......");
		Manager21 obj4 = new Manager21(10);
		System.out.println(".......");
		Manager21 obj5 = new Manager21(1.2);
		System.out.println(".......");

	}
}

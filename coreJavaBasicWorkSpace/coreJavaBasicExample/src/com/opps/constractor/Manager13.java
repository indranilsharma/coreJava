package com.opps.constractor;

//here we can see the prefarence of execution

class Manager13 {
	public Manager13() {
		System.out.println("Manager13()");
	}

	{
		System.out.println("IIB1");
	}

	Manager13(int i) {
		this();
		System.out.println("Manager13(int i)");

	}

	static {
		System.out.println("SIB-1");
	}

	Manager13(int i, int j) {
		this();
		System.out.println("Manager13(int i,int j)");
	}

	static {
		System.out.println("SIB-2");
	}
	{
		System.out.println("IIB-2");
	}
	public static void main(String[] args) {
		Manager13 obj1 =new Manager13();
		System.out.println("...............");
		Manager13 obj2 = new Manager13(0);
		System.out.println("...............");
		Manager13 obj3 = new Manager13(0, 0);
	}
}

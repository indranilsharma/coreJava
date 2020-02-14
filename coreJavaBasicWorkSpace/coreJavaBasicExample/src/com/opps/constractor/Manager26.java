package com.opps.constractor;

class Manager30 {

	public Manager30() {
		System.out.println("Manager30()");
	}

	{
		System.out.println("Manager30-IIB");
	}
	static {
		System.out.println("Manager30-IIB-1");
	}
}

class Manager31 extends Manager30 {

	public Manager31() {
		System.out.println("Manager31()");
	}

	{
		System.out.println("Manager31-IIB");
	}
	static {
		System.out.println("Manager31-IIB-1");
	}
}

class Manager32 extends Manager31 {

	public Manager32() {
		System.out.println("Manager31()");
	}

	static {
		System.out.println("Manager31-IIB-1");
	}

	{
		System.out.println("Manager32-IIB-2");
	}
}

public class Manager26 {

	public static void main(String[] args) {
		Manager32 obj1 = new Manager32();
		System.out.println(".......");
		Manager31 obj2 = new Manager31();
		System.out.println(".......");
		Manager30 obj3 = new Manager30();
		System.out.println(".......");
	}
}
 class Manager27 {

	public static void main(String[] args) {
		Manager32 obj1 = new Manager32();
		System.out.println(".......");
		Manager31 obj2 = new Manager31();
		System.out.println(".......");
		Manager30 obj3 = new Manager30();
		System.out.println(".......");
	}
}

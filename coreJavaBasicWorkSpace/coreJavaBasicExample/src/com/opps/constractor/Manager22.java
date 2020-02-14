package com.opps.constractor;

class Manager25 {
	{
		System.out.println("Manager25-IIB-1");
	}

	public Manager25() {
		System.out.println("Manager25()");
	}

	{
		System.out.println("Manager25-IIB-2");
	}
}

class Manager23 extends Manager25 {
	Manager23() {
		System.out.println("Manager23()");
	}
}
public class Manager22 extends Manager23 {
	
	    Manager22() {
		//this(10);
		//super(10, 20);
		System.out.println("Manager21()");
	   }

	{
		System.out.println("Manager22-IIB-1");
	}


    Manager22(int i) {
	System.out.println("Manager21(int i)");
}

	public static void main(String[] args) {
		Manager25 obj1 = new Manager25();
		System.out.println(".......");
		Manager23 obj2 = new Manager23();
		System.out.println(".......");
		Manager22 obj3 = new Manager22();
		System.out.println(".......");
		Manager22 obj4 = new Manager22(10);
		System.out.println(".......");
	}
}
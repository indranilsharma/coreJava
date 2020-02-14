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
		Manager13 obj1 =new Manager13();
		System.out.println("...............");
		Manager13 obj2 = new Manager13(0);
		System.out.println("...............");
		Manager13 obj3 = new Manager13(0, 0);
	}
}

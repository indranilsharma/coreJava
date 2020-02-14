package com.allKeyword.IIB;

class Manager12 {

	Manager12() {
		System.out.println("Manager12()");
	}

	{
		System.out.println("Manager12-IIb");
	}

}

public class Manager11 extends Manager12 {

	{
		System.out.println("Manager11-IIB");
	}

	Manager11(int i) {
	
		System.out.println("Manager11(int)");
	}

	public static void main(String[] args) {
	
		Manager12 obj = new Manager12();
		System.out.println(".....");
		Manager11 obj1 = new Manager11(20);
		System.out.println("......");
	}
}

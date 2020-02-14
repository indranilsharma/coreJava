package com.allKeyword.Static.Block;

class Manager9 {
	static {
		System.out.println("Manager7-SIB-1");
	}

	static void test() {
		System.out.println("form test-1");
	}
}

public class Manager7 {
	public static void main(String[] args) {
		System.out.println("....");
		Manager9.test();
		System.out.println("....");
	}
	
	/*staic {
		System.out.println("Manager7-SIB-1");
	}*/
}
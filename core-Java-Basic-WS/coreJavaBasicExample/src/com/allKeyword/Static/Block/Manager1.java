package com.allKeyword.Static.Block;

public class Manager1 {
	static int i = test();

	static {
		System.out.println("SIB-begain");
		main(null);
		System.out.println("SIB-end");
	}

	static int test() {
		System.out.println("SIB-begain");
		main(null);
		System.out.println("SIB-end");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("main" + i);
	}
}

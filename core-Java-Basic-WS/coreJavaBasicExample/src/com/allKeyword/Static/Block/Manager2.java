package com.allKeyword.Static.Block;

class Manager3 {
	static {
		System.out.println("Manager-3-SIB-1");
	}

	public static void main(String[] args) {
		System.out.println("Manager-3-Main");
	}

	static {
		System.out.println("Manager3-SIB2");
	}
}

public class Manager2 {
	static {
		System.out.println("SIB-1");
	}

	static {
		System.out.println("SIB-2");
	}

	public static void main(String[] args) {
		System.out.println("Manager2");
	}

}

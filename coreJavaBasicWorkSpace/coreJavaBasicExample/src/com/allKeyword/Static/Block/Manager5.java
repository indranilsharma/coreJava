package com.allKeyword.Static.Block;

class Manager6 {
	static int i = 10;
	static {
		System.out.println("Manager5-SIB-1");
	}
}

public class Manager5 {

	static {
		System.out.println("Manager5-SIB-1");
	}

	public static void main(String[] args) {
		System.out.println("Manager-5-begain");
		System.out.println(Manager6.i);
		System.out.println("Manager-5-end");

	}

}

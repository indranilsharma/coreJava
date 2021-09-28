package com.allKeyword.Static.Block;

class Manager11 {
	/*
	 * static block that gets executed exactly once, when the class is first
	 * loaded
	 */
	static int i;

	static {
		i = 20;
		System.out.println("static block called ");
	}
}

public class Manager10 {

	static int i;
	static {
		i = 50;
		System.out.println("static block called -1");
	}

	public static void main(String[] args) {

		System.out.println(Manager11.i);
	}

}

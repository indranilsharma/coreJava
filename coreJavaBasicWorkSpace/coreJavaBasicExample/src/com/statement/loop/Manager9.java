package com.statement.loop;

public class Manager9 {
	public static void main(String[] argv) {
		System.out.println("main");
		doStuff();
	}

   	static boolean doStuff() {
		for (int x = 0; x < 3; /*x++*/) { //dead code because after first insert return boolean statement 
			System.out.println(x+" in for loop");
			return true;
		}
		return true;
	}
}

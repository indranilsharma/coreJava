package com.statement.loop;

public class Manager7 {
	public static void main(String[] argv) {
		int x;
		for (x = 0; testX(x); x++) {
			System.out.println(x);
			break;
		}
	}
	public static boolean testX(int i) {
		System.out.println(i);
		return true;
	}
}

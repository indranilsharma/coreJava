package com.statement.switchCase;

public class Manager10 {
	public static void main(String[] argv) {
		int x = 2; //after default all statement will execute     
		switch (x) {
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
	}
}
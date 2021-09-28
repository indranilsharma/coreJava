package com.opps.methodCall;

/*
 * If manager16 in the bottom section it will show compile time error 
   because static method should be in first 
*/
public class Manager17 {

	public static void main(String args[]) {
		equality obj = new equality();
		obj.x = 5;
		obj.y = 5;
		System.out.println(obj.isequal());
	}
}

class equality {
	int x;
	int y;

	boolean isequal() {
		return (x == y);
	}
}
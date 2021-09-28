package com.operators.autoboxing;

public class Test3 {
	/*
	 * Two objects will be created here. First object which is pointed by X due
	 * to calling of new operator and second object will be created because of
	 * Auto-boxing.
	 */
	public static void main(String[] args) {

		Integer x = new Integer(20);
		Integer y = 20;
		/*
		 * Due to auto-boxing, a new Wrapper object is created which is pointed
		 * by Y
		 */
		System.out.println(x == y);
	}

}

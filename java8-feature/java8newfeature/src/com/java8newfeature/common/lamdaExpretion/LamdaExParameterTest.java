package com.java8newfeature.common.lamdaExpretion;

interface Parameter {
	// void noparam();

	// int oneparam(int a);

	// int twoparam(int a, int b);

	String twoparamString(String a, String b);

}

public class LamdaExParameterTest {
	public static void main(String[] args) {
		/*
		 * Parameter p = ()->{}; p.noparam();
		 */
		/*
		 * Parameter p = ()->{ System.out.println("i am void"); };
		 */

		/*
		 * Parameter p1 = (a) -> { return a; };
		 */

		// System.out.println(p1.oneparam(20));

		/*
		 * Parameter p = (a, b) -> { return (a + b); };
		 * System.out.println(p.twoparam(20, 30));
		 */

		Parameter p = (a, b) -> {
			return (a + b);
		};

		System.out.println(p.twoparamString("I am ", "name "));
	}
}
package com.opps.Interfaces;

/*
 * classes and interfaces themselves can have only two access specifiers
 *  when declared outside any other class.
1) public
2) default (when no access specifier is specified)
*/
interface B1 {
	// by defutlt final,static
	int i = 20;

	// by defaut public and abstract
	public abstract void name();

	// private method in java 9
	/*
	 * private void method4(){ System.out.println("private method"); }
	 */

}

public class Access_specifier implements B1 {

	@Override
	public void name() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		Access_specifier obj = new Access_specifier();
		obj.name();
		System.out.println(B1.i); // static by default that is why we can access
									// like that way
	}

}

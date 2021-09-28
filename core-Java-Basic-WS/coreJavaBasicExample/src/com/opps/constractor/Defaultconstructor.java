package com.opps.constractor;

public class Defaultconstructor {

	/*
	 * Java automatically creates default constructor if there is no default or
	 * parameterized constructor written by user, and (like C++) the default
	 * constructor automatically calls parent default constructor default
	 * constructor in Java initializes member data variable to default values
	 */

	int i;

	public static void main(String[] args) {

		// defaut cons called
		Defaultconstructor d1 = new Defaultconstructor();
		System.out.println(d1.i);//default value assign
	}

}

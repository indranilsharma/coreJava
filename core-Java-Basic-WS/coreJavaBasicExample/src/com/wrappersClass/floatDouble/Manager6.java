package com.wrappersClass.floatDouble;

/*
the value {@code 0} if {@code anotherDouble} is
*          numerically equal to this {@code Double}; a value
*          less than {@code 0} if this {@code Double}
*          is numerically less than {@code anotherDouble};
*          and a value greater than {@code 0} if this
*          {@code Double} is numerically greater than
*          {@code anotherDouble}.*/

/*
i.compareTo() methods two double values, if they are equal then 0 is returned 
and if not equal then 1 is returned,here 257.57812 and 257.578123456789 are not equal
hence 1 is returned and stored in x.
*/

public class Manager6 {
	public static void main(String args[]) {

		Double y = new Double(257.57812);
		Double i = new Double(257.578123456789);
		try {
			int x = i.compareTo(y);
			System.out.print(x);
		}

		catch (ClassCastException e) {
			System.out.print("Exception");

		}
	}
}

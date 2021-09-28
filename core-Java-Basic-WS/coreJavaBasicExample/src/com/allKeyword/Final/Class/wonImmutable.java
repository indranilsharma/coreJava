package com.allKeyword.Final.Class;


public final class wonImmutable {

	/*
	 * The class must be declared as final (So that child classes can’t be
	 * created) Data members in the class must be declared as final (So that we
	 * can’t change the value of it after object creation) A parameterized
	 * constructor Getter method for all the variables in it No setters(To not
	 * have the option to change the value of the instance variable)
	 */
	final int i;
	final int j;

	public wonImmutable(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public static void main(String[] argv) {

		wonImmutable obj = new wonImmutable(10, 20);
		System.out.println(obj.getI());
		System.out.println(obj.getJ());

	}
}
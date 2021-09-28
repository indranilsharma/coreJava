package com.opps.inheritnce;

class Base {

	// base private derived public possible
	/* public */private void print() {
		System.out.println("Base");
	}
}

class Derived extends Base {

	// @Override
	// cat make private if base access is public
	/* private */ public void print() {
		System.out.println("Derived");
	}
}

public class ReduceAcc extends Base {

	public static void main(String[] args) {

		Derived obj = new Derived();
		obj.print();
	}

}

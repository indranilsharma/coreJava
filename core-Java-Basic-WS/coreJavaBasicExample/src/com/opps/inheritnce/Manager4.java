package com.opps.inheritnce;

class H {

	H() {
		this(10);
		System.out.println("H()");
	}

	H(int i) {
		System.out.println("H(int i)");
	}
}

class F extends H {

	F() {
		super(7);
		System.out.println("F()");
	}

	F(int i) {
		System.out.println("F(int i)");
	}
}

class G extends F {

	G() {
		super(2);
		// this();//super and this can't use at a time
		System.out.println("G()");
	}
}

public class Manager4 {

	public static void main(String[] args) {
		F f = new F();
		System.out.println("............");
		
		G g = new G();// it will go to top level until reach top H class
		System.out.println(".............");
	}

}

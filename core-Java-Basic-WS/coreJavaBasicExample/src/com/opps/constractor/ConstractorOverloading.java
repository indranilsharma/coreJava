package com.opps.constractor;

public class ConstractorOverloading {

	//constructor overloading 
	public ConstractorOverloading() {
		System.out.println("no-arg");
	}

	public ConstractorOverloading(int i) {
		System.out.println("int i ");
	}

	public ConstractorOverloading(double d, float f) {
		System.out.println("doub b,float f");
	}

	public ConstractorOverloading(float f, double d) {
		System.out.println("float f,double d");
	}

	public static void main(String[] args) {
		//match the perfect cons with parameter
		new ConstractorOverloading();
		new ConstractorOverloading(10);
		new ConstractorOverloading(1.1, 1f);
		new ConstractorOverloading(2.2f, 50.5);

	}

}

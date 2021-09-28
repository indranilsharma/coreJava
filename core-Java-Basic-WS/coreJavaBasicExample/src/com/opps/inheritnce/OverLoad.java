package com.opps.inheritnce;

/*overloading work with Inheritance.overloaded method to be 
executed at compile time based upon the type of argument used to call the method and parameters 
of the overloaded methods of both these classes receive the values of arguments used in call and 
executes the overloaded method.*/

class A2 {
	public void print(int i) {
		System.out.println("A2 " + i);
	}
}

class B2 extends A2 {
	public void print(float f) {
		System.out.println("B2 " + f);
	}
}

public class OverLoad {

	public static void main(String[] args) {

		B2 obj = new B2();
		obj.print(3f);
		obj.print(3);

	}

}

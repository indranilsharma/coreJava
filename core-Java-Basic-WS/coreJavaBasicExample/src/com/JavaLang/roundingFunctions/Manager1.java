package com.JavaLang.roundingFunctions;

/*
 * we are try yo used clone() method that is 
 comes under the java.lang package.to used of colning porpose.
*/
class A {

	int x;

	int y;

	void display() {

		System.out.print(x + " " + y);

	}

}

public class Manager1 {
	public static void main(String[] args) {
		A obj1 = new A();

		A obj2 = new A();

		obj1.x = 1;

		obj1.y = 2;

		//obj2 = obj1.clone();//clone method here is not visible

		obj1.display();

		obj2.display();

	}
}

package com.JavaLang.RuntimeClassLoader;

/*@param   obj the object to check
* @return  true if {@code obj} is an instance of this class
		
		Although class Y1 extends class X1 but still 
		a is not considered related to Y1. hence isInstance() returns false.		
*/

class X1 {

	int a;

	double b;

}

class Y1 extends X1 {

	int c;

}

public class Manager3 {
	public static void main(String args[]) {

		X1 a = new X1();

		Y1 b = new Y1();

		Class obj;

		obj = b.getClass();

		System.out.print(obj.isInstance(a));

	}
}

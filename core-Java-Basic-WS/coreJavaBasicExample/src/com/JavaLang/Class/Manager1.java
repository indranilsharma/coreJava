package com.JavaLang.Class;

/*The {@code Class} object that represents the runtime
*         class of this object.
*/


/*getClass() is used to obtain the class of an object, here ‘a’ is an object of class ‘X’.
hence a.getClass() returns ‘X’ which is stored in class Class object obj*/

class X3{
	int a;
	double b;

}

class Y3 extends X3 {

	int c;
}

public class Manager1 {
	public static void main(String args[]) {

		X3 a = new X3();
		Y3 b = new Y3();
		Class obj;
		obj = a.getClass();
		System.out.print(obj.getName());

	}
}
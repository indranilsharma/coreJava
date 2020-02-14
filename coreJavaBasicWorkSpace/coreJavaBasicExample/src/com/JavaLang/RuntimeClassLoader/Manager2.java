package com.JavaLang.RuntimeClassLoader;

/*@return the superclass of the class represented by this object.

Returns the runtime class of this {@code Object}. The returned
     * {@code Class} object is the object that is locked by {@code
     * static synchronized} methods of the represented class.

		
*/
class A {

	int a;

	double b;

}

class B extends A {

	int c;

}

class Manager2 {

	public static void main(String args[]) {

		A a = new A();

		B b = new B();

		Class obj;

		obj = b.getClass();

		System.out.print(b.equals(a));

	}

}
package com.allKeyword.Final.Class;

/*A local variable or method parameter must be declared final if 
it is to be used by an inner class declared inside a method.
*/
public class Manager9 {
	public static void main(String[] argv) {
		int i = 0;

		class MyClass9 {
			void m() {

				System.out.println(i);
			}
		}

	}
}
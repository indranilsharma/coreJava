
package com.allKeyword.Static.nestedClasse;

import com.allKeyword.Static.nestedClasse.OuterClass.InnerClass;
import com.allKeyword.Static.nestedClasse.OuterClass.NestedClass;

class OuterClass {

	/*
	 * A static nested class may be instantiated without instantiating its outer
	 * class. Inner classes can access both static and non-static members of the
	 * outer class. A static class can access only the static members of the
	 * outer class.
	 */	
	static int i;
	int j = 10;
	private static int k;

	// static inner class
	static class NestedClass {

		void print() {
			System.out.println("static member " + i);
			// as static nested class cannot directly access non-static member
			// System.out.println(j);
			System.out.println("private static " + k);
		}

		static void display() {
			System.out.println("static member " + i);
			// as static nested class cannot directly access non-static member
			// System.out.println(j);
			System.out.println("private static " + k);
		}

	}

	// non static class
	class InnerClass {

		void print() {
			System.out.println("InnerClass static member " + i);
			// as non static nested class directly access non-static member
			System.out.println("InnerClass "+j);
			System.out.println("InnerClass private static " + k);
		}

	}
}

public class Manager13 {

	public static void main(String[] args) {

		OuterClass.NestedClass obj = new OuterClass.NestedClass();
		obj.print();// non static method of static inner class
		NestedClass.display();// static method of static inner class

		// to access non static member
		OuterClass outer = new OuterClass();
		System.out.println(outer.j);
		
		InnerClass innObj = outer.new InnerClass();
		innObj.print();
	}
}

package com.allKeyword.Final.variable;

/*Local variables and method parameters may also be declared as final
to enable them to be accessed by local inner classes.
*/

public class Manager6 {
	public static void main(String[] argv) {
		System.out.println();

		final int i = 0;

		class InnerClass {
			public InnerClass() {
				System.out.println(i);
			}
		}
	}
}

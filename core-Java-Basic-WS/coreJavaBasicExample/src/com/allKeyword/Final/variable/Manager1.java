package com.allKeyword.Final.variable;

/*final variables cannot be re-initialized once assigned a value.
final reference variables cannot refer to a different object once the object has been assigned.
final reference variables must be initialized before the constructor completes.
final is the only modifier available to local variables.
*/

public class Manager1 {

	final int i = 0;
	// i=1; // error can't re-assgine

	public static void main(String[] argv) {
		Manager1 obj = new Manager1();
      System.out.println(obj.i);
	}

}

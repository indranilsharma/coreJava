package com.JavaLang.systemClass;

/*all are same from previous but here we manupulate
  only length part*/


public class Manager3 {
	public static void main(String args[]) {
		byte a[] = { 65, 66, 67, 68, 69, 70 };
		byte b[] = { 71, 72, 73, 74, 75, 76 };
		System.arraycopy(a, 0, b, 3, a.length - 3);
		System.out.print(new String(a) + " " + new String(b));

	}
}

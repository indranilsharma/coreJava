package com.allKeyword.Final.variable;

/*If a final variable references to an object, 
 the reference must stay the same(not the object) 
*/

class MyClass {
	int weight;

	MyClass(int w) {
		weight = w;
	}
}

public class Manager3 {
	final MyClass w1 = new MyClass(1500);

	void test() {
		//w1 = new MyClass(1400); // Illegal  The final field Manager3.w1 cannot be assigned
		w1.weight = 1800; // Legal
	}
}

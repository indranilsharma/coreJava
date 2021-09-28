package com.opps.constractor;

class MySingleton {

	/*
	 * Internal Constructor chaining 
	 * Singleton class design pattern
	 */

	static MySingleton instance = null;
	public int x = 10;

	private MySingleton() {
		System.out.println("private cons");
	}

	// factory method
	static public MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
}

public class PrivateConstructors {

	public static void main(String[] args) {
		MySingleton a = MySingleton.getInstance();
		MySingleton b = MySingleton.getInstance();
		a.x = a.x + 200;
		System.out.println(a.x);

		System.out.println(b.x);
		/*
		 * We changed value of a.x, value of b.x also got updated because both
		 * ‘a’ and ‘b’ refer to same object, i.e., they are objects of a
		 * singleton class.
		 */
	}

}

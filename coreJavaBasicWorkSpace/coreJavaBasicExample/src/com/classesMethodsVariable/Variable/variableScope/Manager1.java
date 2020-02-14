package com.classesMethodsVariable.Variable.variableScope;

/*Static variables have the longest scope.
Static variables are created when the class is loaded.
Instance variables are created when a new instance is created, and they live until the instance is removed.
Local variables live as long as their method remains on the stack. 
Block variables live only as long as the code block is executing.*/

public class Manager1 {

	static int s = 343; // static variable

	int x; // instance variable

	// initialization block
	{
		System.out.println("static access:"+x);
		x = 7;
		int x2 = 5;// block variable
		System.out.println("block x2:" + x2);
		System.out.println("static override:"+x);


	}

	// constructor
	Manager1() {
		System.out.println("static access:"+x);
		x += 8;
		int x3 = 6;// local variable
		System.out.println("local x3:" + x3);
		System.out.println("static override:"+x);

	}

	void doStuff() { // method

		int y = 0; // local variable

		for (int z = 0; z < 4; z++) { // 'for' code block
			y += z + x;
			System.out.println("local y:" + y);
		}
	}

	public static void main(String[] args) {
		Manager1 manager1 = new Manager1();// default fired
		System.out.println(s);
		manager1.doStuff();
	}
}
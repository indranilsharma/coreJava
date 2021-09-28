package com.classesMethodsVariable.basic;

/*When we assign an object to another object of same type, all the 
elements of right side object gets 
copied to object on left side of equal to, =, operator.*/


class Box1 {
	int width;
	int height;
	int length;
}

public class Manager3 {
	public static void main(String args[])

	{

		Box1 obj1 = new Box1();

		Box1 obj2 = new Box1();

		obj1.height = 1;

		obj1.length = 2;

		obj1.width = 1;

		obj2 = obj1;

		System.out.println(obj2.height);

	}
}

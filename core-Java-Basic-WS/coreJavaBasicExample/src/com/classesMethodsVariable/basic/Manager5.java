package com.classesMethodsVariable.basic;

/*When we assign an object to another object of same type, all the 
elements of right side object gets 
copied to object on left side of equal to, =, operator.*/

class Box4 {

	int width;
	int height;
	int length;
	int volume;

	void volume(int height, int length, int width) {
		volume = width * height * length;
	}
}

public class Manager5 {
	public static void main(String args[])

	{

		Box4 obj = new Box4();

		obj.height = 1;
		obj.length = 5;
		obj.width = 5;
		obj.volume(3, 2, 1);

		System.out.println(obj.volume);
	}
}

package com.classesMethodsVariable.basic;

/* When we print object internally toString() will be called to return string 
   into this format classname@hashcode in hexadecimal form.*/

class Box2 {
	int width;
	int height;
	int length;
}

public class Manager4 {
	public static void main(String args[])

	{

		Box2 obj = new Box2();
		System.out.println(obj);

	}
}

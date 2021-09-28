package com.classesMethodsVariable.basic;

class Box {
	int width;
	int height;
	int length;
}

public class Manager2 {
	public static void main(String args[])

	{

		Box obj = new Box();

		obj.width = 10;

		obj.height = 2;

		obj.length = 10;

		int y = obj.width * obj.height * obj.length;

		System.out.print(y);

	}
}

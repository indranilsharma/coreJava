package com.opps.inheritnce;

//Parent and Child classes having same data member in Java

class Parent {
	String s = "Parent";

	public Parent() {
		System.out.println("Parent-cons");
	}
}

class Child extends Parent {
	String s = "Child";

	public Child() {
		System.out.println("Child-cons");
	}
}

public class Manager6 {

	public static void main(String[] args) {

		Parent obj_3 = new Child();
		System.out.println(obj_3.s);
		System.out.println("=======================");

		Child obj = new Child();
		Parent obj_2 = obj;
		System.out.println(obj.s);
		System.out.println(obj_2.s);

		System.out.println("=======================");
		Parent obj_1 = new Parent();
		System.out.println(obj_1.s);

	}

}

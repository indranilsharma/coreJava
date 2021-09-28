package com.JavaLang.Class;

/*@return the superclass of the class represented by this object.
		getSuperClass() returns the super class of an object. b is an object of class Y which
		extends class X , 
		Hence Super class of b is X. therefore class X is printed.*/

class X {

    int a;

    double b;

}

class Y extends X {

int c;

}

public class Manager2 {
	public static void main(String args[]) {

        X a = new X();

        Y b = new Y();

        Class obj;

        obj = b.getClass();

        System.out.print(obj.getSuperclass());

    }
}

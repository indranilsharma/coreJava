package com.opps.Interfaces;

interface C {
	void test();//all method by default abstract and public
}

interface D2{
}
/*
 * We can’t create instance(interface can’t be instantiated) of interface but we
 * can make reference of it that refers to the Object of its implementing class.
 * A class can implement more than one interface. 
 * An interface can extends another interface or interfaces (more than one interface) . 
 * A class that implements interface must implements all the methods in interface.
 * All the methods are public and abstract. And all the fields are public, static, and
 * final. 
 * It is used to achieve multiple inheritance. 
 * It is used to achieve loose coupling.
 */

public class Manager1 implements C,D2 {

	@Override
	public void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		Manager1 m=new Manager1();
		m.test();
	}
}

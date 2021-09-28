package com.allKeyword.abstrac.method_class;

abstract class Manager9 {
	
	abstract void test1();
	
	void test2(){
		System.out.println("test2()");

	}
}

class Manager8 extends Manager9 {
	
	void test1(){
		System.out.println("test2()");
	}

	public static void main(String[] args) {
	System.out.println("main");
	Manager8 obj = new Manager8();
	obj.test1();
	obj.test2();
	System.out.println("done");
  }
}

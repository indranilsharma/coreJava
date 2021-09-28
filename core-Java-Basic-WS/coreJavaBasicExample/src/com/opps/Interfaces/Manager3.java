package com.opps.Interfaces;

interface E {
	void test();

	int test(int i);
}

abstract class F implements E{
public void test() {
	System.out.println("test");
}
}

public class Manager3 extends F{

	@Override
	public int test(int i) {
	System.out.println("test(int i)");
		return 100;
	}
public static void main(String[] args) {
	Manager3 m=new Manager3();
	m.test();
	m.test(10);
	System.out.println(m.test(10000));//return value print
}
}

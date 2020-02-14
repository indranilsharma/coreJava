package com.CollectionFramework.generics;

interface J<X> {

	void test(X i);

	X test1(X i, int j);
}

class K implements J<Integer> {

	@Override
	public void test(Integer i) {
		System.out.println("default test -K");
	}

	@Override
	public Integer test1(Integer i, int j) {
		System.out.println("genaric return tytpe");
		return i;
	}

}

class L implements J<String> {

	@Override
	public void test(String s) {
		System.out.println("default test -L");
	}

	@Override
	public String test1(String s, int j) {
		System.out.println("genaric return tytpe");
		return s;
	}
}

public class Manager8 {
	public static void main(String[] args) {
		System.out.println("done");
	}
}

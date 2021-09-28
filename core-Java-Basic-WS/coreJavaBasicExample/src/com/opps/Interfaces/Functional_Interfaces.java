package com.opps.Interfaces;

/*
A functional interface has only one abstract method but it can have multiple default methods.
@FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method.
The use of this annotation is optional.
The java.util.function package contains many builtin functional interfaces in Java 8.*/

@FunctionalInterface
interface Add {
	int calculate(int x, int y);

}

public class Functional_Interfaces {

	public static void main(String[] args) {

		int i = 20, j = 50;

		Add s = (int x, int y) -> x + y;

		int res = s.calculate(i, j);

		System.out.println(res);
	}

}

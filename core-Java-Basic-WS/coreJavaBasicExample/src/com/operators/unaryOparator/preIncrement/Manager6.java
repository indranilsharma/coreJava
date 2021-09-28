package com.operators.unaryOparator.preIncrement;

public class Manager6 {
	public static void main(String[] args) {
		int i = 0;
		int j = --i + i + --i + i;
		System.out.println(i);//-2
		System.out.println(j);//-6
	}
}

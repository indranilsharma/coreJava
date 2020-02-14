package com.operators.unaryOparator.postIncrement;

public class Manager5 {
	public static void main(String[] args) {
		int i = 0;
		int j= i++ + i;
		System.out.println(i);//1
		System.out.println(j);//1
	}
}

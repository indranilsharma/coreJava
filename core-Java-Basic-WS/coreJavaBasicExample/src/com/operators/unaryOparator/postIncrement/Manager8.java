package com.operators.unaryOparator.postIncrement;

public class Manager8 {
	public static void main(String[] args) {
		int i = 0;
		int j= i-- + i-- + i-- + i; //0+ -1 + -2 + -3
		
		System.out.println(i);//-3
		System.out.println(j);//-6
	}
}

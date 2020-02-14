package com.operators.unaryOparator.postIncrement;

public class Manager10 {
	public static void main(String[] args) {
		int i = 0;
		int j= i++ + i + i-- + i;
		
		System.out.println(i);	//0
		System.out.println(j);//2
	}
}

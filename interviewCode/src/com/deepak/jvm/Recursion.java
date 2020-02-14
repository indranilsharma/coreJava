package com.deepak.jvm;

public class Recursion {
public static void main(String[] args) {
	fun(10);
}

private static void fun(int i) {
	System.out.println(i);
	if(i>1)
	{
		fun(i-1);
		System.out.println("---"+(i-1));
	}
	System.out.println("Recursion :: "+i);
	
}
}

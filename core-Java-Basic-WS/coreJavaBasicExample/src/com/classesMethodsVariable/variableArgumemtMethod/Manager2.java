package com.classesMethodsVariable.variableArgumemtMethod;

public class Manager2 {
	public static void method(int...i) { //variable argument
		//System.out.println(i);
		int total =0;
		for (int j : i) {
			total=total+j;
			System.out.println("j :"+j+" "+total);
		}
	}
public static void main(String[] args) {
	method();
	method(20);
	method(20,20);//number of parameter different 
	method(20,20,20);
}
}
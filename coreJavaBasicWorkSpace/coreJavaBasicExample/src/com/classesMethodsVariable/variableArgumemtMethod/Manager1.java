package com.classesMethodsVariable.variableArgumemtMethod;

public class Manager1 {
	public static void method(int...i) { //variable argument
		System.out.println(i);
	}
public static void main(String[] args) {
	method(20);
	method(20,20);//number of parameter different 
	method(20,20,20);
}
}

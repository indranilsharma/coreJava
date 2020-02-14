package com.allKeyword.This;

public class Manager10 {
public Manager10() {
	this(10);
	System.out.println("10");
	
}
public Manager10(int i) {
	this(1,10);
	System.out.println("10(int )");
}
public Manager10(int i,int j) {
	System.out.println("10(int i, int j)");
}
public static void main(String[] args) {
	Manager10 obj= new Manager10();
	System.out.println("default constractor");
	Manager10 obj1= new Manager10(10);
	System.out.println("one parameterised constactor");
	Manager10 obj2= new Manager10(10, 10);
	System.out.println("2 parametersid");
	
}
}

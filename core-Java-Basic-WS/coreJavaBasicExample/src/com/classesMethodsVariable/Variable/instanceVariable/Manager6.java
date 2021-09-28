package com.classesMethodsVariable.Variable.instanceVariable;

//Non-initialized string instance variable

public class Manager6 {
	
	private String title; // instance reference variable

	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		Manager6 b = new Manager6();
		System.out.println("The title is " + b.getTitle());
	}
}

package com.JavaLang.Class;

import java.lang.reflect.Method;

public class ObjecetClassDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			count ++;
			System.out.println(method.getName());
		}
		System.out.println("The number of method :" + count);
	}
}

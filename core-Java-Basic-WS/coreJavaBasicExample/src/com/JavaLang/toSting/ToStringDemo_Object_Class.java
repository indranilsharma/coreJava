package com.JavaLang.toSting;

import java.util.ArrayList;

public class ToStringDemo_Object_Class {
	public static void main(String[] args) {
		String s = new String("India");
		System.out.println(s);
		Integer i = new Integer(100);
		System.out.println(i);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(121);
		al.add(125);
		System.out.println(al);
		ToStringDemo_Override obj = new ToStringDemo_Override();
//		its not override toSting method 
		System.out.println(obj);
	}
}

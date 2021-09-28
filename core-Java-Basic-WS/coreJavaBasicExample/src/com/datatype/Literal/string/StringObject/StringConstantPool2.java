package com.datatype.Literal.string.StringObject;

public class StringConstantPool2 {

	public static void main(String[] args) {
		String s1 = new String("india");
		String s2 = s1.toUpperCase();//INDIA
		String s3 = s1.toLowerCase();// pointing to same object
		
		System.out.println(s1 == s2);//false--because 2 object created in heap area
		System.out.println(s1 == s3);//true--pointing to same object 
	}
}

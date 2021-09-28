package com.datatype.Literal.string.StringLiterals;

public class StringMethod {
	public static void main(String[] args) {
		String s = "java";
		System.out.println(s.equals("JAVA"));
		System.out.println(s.equalsIgnoreCase("JAVA"));
		String s1 = " java8 Spring Hibernate Angular ";
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(2, 8));
		System.out.println(s1.length());
		System.out.println(s.replace("a", "A"));
		System.out.println(s.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.indexOf("r"));
		System.out.println(s1.lastIndexOf("a"));
	}
}

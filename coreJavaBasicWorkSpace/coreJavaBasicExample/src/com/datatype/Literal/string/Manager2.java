package com.datatype.Literal.string;

public class Manager2 {
	public static void main(String[] args) {
		
		String s1=null;
		s1=s1+null+s1;
		//s1=null+null compile time error
		System.out.println(s1);
		System.out.println(s1.length());//null pointer Exception in case of line number 7 is commented
		
	}

}

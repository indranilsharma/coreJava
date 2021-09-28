package com.datatype.Literal.string.StingBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("India");
		StringBuffer sb1 = new StringBuffer("India");
		System.out.println(sb.capacity());
		
		System.out.println(sb == sb1);
//		its call object class equals()--return reference comparison but not content 
		System.out.println(sb.equals(sb1));
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
//		Biggest advantage of string buffer we can edit (un-mutable)   
		sb.append("--BRICS--");
		sb.append("Kabul-2021");
		System.out.println(sb);
		
		sb.insert(5, "---Meeting---");
		System.out.println(sb);
		
		char arr[] = {'A','B','C','D','E','-'};
		sb.insert(8, arr);
		System.out.println(sb);
		
		sb.reverse();
		sb.replace(5, 8, "$$$$$$$");
		System.out.println(sb);
		
		System.out.println(sb.charAt(10));
	}
}

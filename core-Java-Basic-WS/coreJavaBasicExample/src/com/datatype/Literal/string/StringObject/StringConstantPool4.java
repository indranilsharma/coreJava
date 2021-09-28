package com.datatype.Literal.string.StringObject;

public class StringConstantPool4 {

	public static void main(String[] args) {

		String s1 = new String("Kite Runner");
//		intern() return SCP object reference 
		String s2 = s1.intern();
//		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s1 == s2);
		String s3 = "Kite Runner";
//		 both are object present in SCP area pointing to same object 
		System.out.println(s2 == s3);
		String s4 = "Aam atir vepu";
		System.out.println(s3 == s4);
		
	}
}

package com.datatype.Literal.string;

public class Manager4 {
	public static void main(String[] args) {
		
		String s1="adbcdef";
		String s2="abc abc abc";
		System.out.println(s1.charAt(2));//b
		System.out.println(s1.charAt(0));//a
		//System.out.println(s1.charAt(100));//StringIndexOutOfBoundException
		int i=s1.indexOf('m');
		 int j=s1.indexOf('c');
		 System.out.println(i);
		 System.out.println(j);
		 int k=s1.indexOf("a", 0);
		 int l=s1.indexOf("def");
		 int m=s1.indexOf("ef");
		 int n=s2.indexOf("abc",5);
		 int a1=s2.lastIndexOf("b");
		 int a2=s1.lastIndexOf("d");
		 System.out.println("---------");
		 System.out.println(k);
		 System.out.println(l);
		 System.out.println(n);
		 System.out.println(a1);
		 System.out.println(a2);
		
	}

}

package com.deepak.logical;

public class SwapTwoString {
	public static void main(String[] args) {
		String s1 = "vivek";
		String s2 = "rahul";
		s1=s1+s2; //10 length of s1
		System.out.println(s1);
		s2=s1.substring(0,(s1.length()-s2.length())); //10-5 s2-vivekrahul---vivek
		s1=s1.substring(s2.length()); //vivek -5 //vivekrahul
		System.out.println("s1 :: "+s1);
		System.out.println("s2 :: "+s2);
		
	}
}

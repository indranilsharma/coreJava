package com.datatype.array;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		
	String a[]=null;
	String s1="Ram is great";
	System.out.println(s1);
	int n=s1.length();
	for(int i=0;i<n/2;i--)
	{
	 a=s1.split(" ");
	 System.out.print(Arrays.toString(a));
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}

}
}
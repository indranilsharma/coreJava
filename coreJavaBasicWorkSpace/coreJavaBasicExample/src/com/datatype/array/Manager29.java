package com.datatype.array;
import java.util.*;

// program to reverse the elements of an array
public class Manager29 {
	
	
	public static void main(String[] args) {
		
		
		int x[]={23,12,24,55,55,89,34,33,89,56};
		
			System.out.println(Arrays.toString(x));
		
		System.out.println("---------");
		for(int i=0;i<x.length/2;i++)
		{
			int temp=x[i];
			x[i]=x[x.length-i-1];
			x[x.length-i-1]=temp;
		}
		
			System.out.println(Arrays.toString(x));
		
		
		
		
	}

}

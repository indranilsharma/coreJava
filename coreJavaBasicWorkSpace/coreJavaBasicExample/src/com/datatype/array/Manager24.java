package com.datatype.array;

// program to find min value of an array

public class Manager24 {
	
	public static void main(String[] args) {
		
		int x[]={2,4,5,9,1,19,33,34,90};
		int min=x[0];
		for(int i=1;i<x.length; i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		System.out.println(min);
	}

}

package com.datatype.array;

// program to find the sum and average of an int array

public class Manager25 {
	public static void main(String[] args) {
		
		int x[]={10,3,89,9,8,33,23};
		int sum=0;
		int avg=x.length;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println(sum);
		System.out.println(sum/avg);
	}

}

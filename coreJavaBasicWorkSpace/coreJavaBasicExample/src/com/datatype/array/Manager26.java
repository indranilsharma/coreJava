package com.datatype.array;

// program to find the average of first half and second half 

public class Manager26 {
	public static void main(String[] args) {
		
		int x[]={2,4,5,3,1,5,6,13,19,8};
		int sum=0;
		int mid=x.length/2;
		
		for(int i=0;i<mid;i++)
		{
			sum+=x[i];
		}
		System.out.println(sum/mid);
		System.out.println("----------");
		sum=0;
		for(int j=mid;j<x.length;j++)
		{
			sum+=x[j];
		}
		System.out.println(sum/mid);
	}

}

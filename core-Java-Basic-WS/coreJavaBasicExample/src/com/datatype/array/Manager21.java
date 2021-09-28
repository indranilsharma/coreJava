package com.datatype.array;

// to find the max value of an array(array must be integer array)
public class Manager21 {
	public static void main(String[] args) {
		
		int x[]={-1,-2,-3,-4,-5};
		int max=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		System.out.println(max);
	}
	

}

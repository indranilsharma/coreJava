package com.datatype.array;

//program to find out the array left strength or right strength

public class Manager27 {
	
	public static void main(String[] args) {
		
		int x[]={1,5,4,33,66,43,54,32,21,42};
		int mid=x.length/2;
		int leftSum=0,rightSum=0;
		for(int i=0;i<mid;i++)
		{
			leftSum+=x[i];
		}
		for(int j=mid;j<x.length;j++)
		{
			leftSum+=x[j];
		}
		if(leftSum>rightSum)
		{
			System.out.println("left sum has more strenth");
		}
		else if(leftSum<rightSum)
		{
			System.out.println("right sum is more length");
		}else
		{
			System.out.println("both are equal");
		}
	}

}
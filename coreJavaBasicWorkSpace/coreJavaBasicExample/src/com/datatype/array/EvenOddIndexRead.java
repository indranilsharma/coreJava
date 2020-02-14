package com.datatype.array;

// print 1st half even and 2nd half odd elements
public class EvenOddIndexRead {
	public static void main(String[] args) {
		
		int []x={2,5,6,4,7,8,10,11,32,6,47,88,34,20};
		int mid=x.length/2;
		for(int i=0;i<mid;i++)
		{
			if(x[i]%2==0)
			{
				System.out.println(x[i]);
			}
		}
		System.out.println("-------------");
		for(int j=mid;j<x.length;j++)
		{
			if(x[j]%2!=0)
			{
				System.out.println(x[j]);
			}
		}
	}
	

}

package com.datatype.array;
import java.util.*;

// program to implement sorting(Ascending order)

public class Manager28 {
	public static void main(String[] args) {
		int x[]={12,3,4,5,6,22,44,56,99,88,44,55,55};
		int temp;
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));

		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]>x[i+1])
			{
			temp=x[i];
			x[i]=x[i+1];
			x[i+1]=temp;
			}
		}
		
			System.out.println("-----------");
			for(int i=0;i<x.length;i++)
			{
				System.out.print(x[i]+ ",");
			}
		}
	}



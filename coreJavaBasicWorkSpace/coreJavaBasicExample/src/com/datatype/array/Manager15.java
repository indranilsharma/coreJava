package com.datatype.array;

//assign index itself as an array
public class Manager15 {
	public static void main(String[] args) {
		
		int []x=new int[10];
		for(int m=0;m<x.length;m++)
		{
			x[m]=x.length-m;
		}
		for(int m=0;m<x.length;m++)
		{
			System.out.println(m+" "+x[m]+" ");;
		}
		
	}

}

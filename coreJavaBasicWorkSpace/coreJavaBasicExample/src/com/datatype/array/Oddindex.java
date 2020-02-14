package com.datatype.array;

// to print only the odd index elements;
public class Oddindex {
	public static void main(String[] args) {
		
		int[]x={10,30,34,20,40,43,22,32,41};
		for(int i=1;i<x.length;i=i+2)
		{
			System.out.println(x[i]);
		}
	}

}

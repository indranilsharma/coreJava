package com.datatype.array;

//to print the elements in reverse order
public class PrintReverseOrder {
	public static void main(String[] args) {
		
		int []x={1,30,4,2,9};
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}

}

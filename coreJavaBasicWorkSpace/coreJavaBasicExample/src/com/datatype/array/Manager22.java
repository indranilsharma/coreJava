package com.datatype.array;
//to print the required patterns
public class Manager22 {
	public static void main(String[] args) {
		char ch='*';
		for(int row=0;row<5;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print(ch+"");
			}
			System.out.println();
		}
		
	}

}

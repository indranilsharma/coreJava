package com.datatype.array;

// program to sort elements of any array

public class sorting {
	public static void main(String[] args) {
		
		int x[]={23,12,32,54,6,7,90,48,91,4,4,6};
		int n=x.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(x[i]+" ");
		}
		for(int i=0;i<(n-1);i++)
		{
			for(int j=0;j<(n-i-1);j++)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		System.out.println("---------");
		for(int i=0;i<n;i++){
			System.out.print(x[i]+" ");
		}
			
		
	}

}
package com.deepak.pattern;

public class Pattern4 {
public static void main(String[] args) {
	/*
	Result on console in this pattern
	999999999
	88888888
	7777777
	666666
	55555
	4444
	333
	22
	1*/
/*	for (r = 1; r <= 10; r++) {
		 
		for (c1 = 1; c1 <10-r; c1++) {
		  System.out.print(" ");
		}
		 
		for (c2 = 1; c2 <= r; c2++) {
		    System.out.print(c2 + " ");
		}
		 
		System.out.println("");
		}*/
		 
	int k=9;
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=k;j++)
		{
			System.out.print(k);
		}
		--k;
		System.out.println();
	}
}
}

package com.deepak.pattern;

public class Pattern5 {
public static void main(String[] args) {
	/*Result on console in this pattern
        1
       22
      333
     4444
    55555
   666666
  7777777
 88888888
999999999*/ 
	
	/*for (r = 1; r <= 10; r++) {
		 
		for (c1 = 1; c1 <10-r; c1++) {
		  System.out.print(" ");
		}
		 
		for (c2 = 1; c2 <= r; c2++) {
		    System.out.print(c2 + " ");
		}
		 
		System.out.println("");
		}*/
		 
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=9-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
}
}

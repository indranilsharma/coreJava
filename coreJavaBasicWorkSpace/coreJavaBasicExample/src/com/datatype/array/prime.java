package com.datatype.array;


// program to implement a number is prime or not
public class prime {
	
	
		public  boolean isPrime(int n)
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
				
			}
			return true;
		}
		public static void main(String[] args) {
			prime man1=new prime();
			System.out.println("Is 13 the prime number:" +man1.isPrime(13));
		}
}
package com.datatype.array;

// print 1st half odd index and 2nd half even index elements
public class OddEvenIndexRead {


		public static void main(String[] args) {
			
			int []x={1,2,3,4,5,6,7,8,9,10,11};
			int mid=x.length/2;
			System.out.println(mid);
			System.out.println("-------");
			for(int i=1;i<mid;i+=2)
			{
				System.out.println(x[i]);
			}
			if(mid%2!=0)
			{
				mid++;
			}
			
			System.out.println("----------");
			for(int j=mid;j<x.length;j+=2)
			{
				System.out.println(x[j]);
			}
		}

	}



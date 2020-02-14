package com.deepak.java8Features;

interface infra
{
	public void add (int i , int j);
}
public class Test3 {
	
	public static void sum(int x , int y) {
		System.out.println("sum of"+(x+y));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		infra i=(a,b)->System.out.println("sum of"+(a+b));
		i.add(10, 20);
		infra i2=Test3::sum;//method refrance 
		i2.add(40, 50);

	}

}

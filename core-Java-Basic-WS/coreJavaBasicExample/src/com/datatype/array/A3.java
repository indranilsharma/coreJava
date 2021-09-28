package com.datatype.array;
interface A2
{
	int a=10;
	public void show();
	
}
interface B1
{
	int a=24;
	public void show();
}
public class A3 implements A2,B1
{
	public void show()
	{
		System.out.println("throw()");
	}
	public static void main(String[] args) {
		A3 a1=new A3();
		System.out.println("---------");
		a1.show();
		
	}
}

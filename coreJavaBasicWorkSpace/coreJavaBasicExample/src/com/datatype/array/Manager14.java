package com.datatype.array;
interface A14
{
	int a=10;
	public void show();
	
}
interface B14
{
	int a=24;
	public void show();
}
public class Manager14 implements A14,B14
{
	public void show()
	{
		System.out.println("throw()");
	}
	public static void main(String[] args) {
		Manager14 a1=new Manager14();
		System.out.println("---------");
		a1.show();
		
	}
}

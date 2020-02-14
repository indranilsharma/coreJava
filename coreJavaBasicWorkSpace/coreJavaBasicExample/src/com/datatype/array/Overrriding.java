package com.datatype.array;

class A11 {
	
	 void show()
	{
		System.out.println("Parent Show");
		
	}

}
class C11 extends A11
{
	 void show()
	{
		System.out.println("child show()");
	}
	 void show1()
	 {
		 System.out.println("Hello");
	 }
}
public class Overrriding
{
	public static void main(String[] args) {
		System.out.println("hehho");
		A11 a=new C11();
		a.show();
		((C11) a).show1();
	}
}


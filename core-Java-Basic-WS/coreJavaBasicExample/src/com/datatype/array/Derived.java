package com.datatype.array;

// program to implement dynamic polymorphism

class Base
{

	
  	void show()
	{
		System.out.println(" Base");
	}
}
public class Derived  extends Base{

	
    /* void show()
	{
		System.out.println("Derived");
	}*/

	 public static void main(String[] args) {
		 
		       
		  Base b3 = new Derived(); // Runtime Polimorphism
		       b3.show();
		       
		      
	}
}


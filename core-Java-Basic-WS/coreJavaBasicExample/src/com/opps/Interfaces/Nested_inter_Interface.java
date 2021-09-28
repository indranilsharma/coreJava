package com.opps.Interfaces;

interface Test1 {

	void print(); 
	
	interface Nested1 {
		void show();
	}
	
	/*protected interface Nested_protected1{
		void show(int i);
	}*/
}

class Derived1 implements Test1,Test1.Nested1 {

	@Override
	public void show() {
		  System.out.println("@Override show");
	}

	//to access Test1 method
	@Override
	public void print() {
       System.out.println("print ");		
	}


/*	@Override
	public void show(int j) {
      System.out.println("protected()");
      
	}*/
	 
}

public class Nested_inter_Interface {

	public static void main(String[] args) {
       
		Derived1 d1= new Derived1();
		d1.print();
		
		Test1.Nested1 obj;
		obj=d1;
		obj.show();
		
	}

}

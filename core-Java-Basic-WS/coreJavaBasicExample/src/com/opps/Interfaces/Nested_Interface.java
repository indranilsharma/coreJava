package com.opps.Interfaces;

class Test {
	
	  public void show(){
		  System.out.println("class show");
	  }
	
	interface Nested{
		void show();
	}
	
	protected interface Nested_protected{
		void show(int i);
	}
}

class Derived extends Test implements Test.Nested, Test.Nested_protected{

	@Override
	public void show() {
		  System.out.println("@Override show");
		  super.show();
	}

	@Override
	public void show(int j) {
        System.out.println("protected()");
        
	}
 	 
}

public class Nested_Interface {
	
	public static void main(String[] args) {
        
		Derived d= new Derived();
	    d.show();	
	    Test.Nested obj;
	    obj=d;
	    obj.show();
	    
	    Test.Nested_protected obj1;
	    obj1=d;
	    obj1.show(10);
	    
	}

}

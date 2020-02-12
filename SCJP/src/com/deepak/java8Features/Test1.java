package com.deepak.java8Features;

public class Test1 {
	
	public static void m1()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			
		}
	}
    
	public static void main(String[] args) {
    Runnable r = Test1::m1;
      Thread t = new Thread(r);
    t.start();
   
   for (int i = 0; i <10; i++) {
	   System.out.println("main thrad");
	
}
	}

}

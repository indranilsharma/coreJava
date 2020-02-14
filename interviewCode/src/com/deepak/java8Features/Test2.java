package com.deepak.java8Features;

public class Test2 {
	private int m1()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			
		}
		return 10;
	}
    
	public static void main(String[] args) {
	Test2 t1 = new Test2();	
    Runnable r = t1::m1;
    System.out.println(r.getClass());
      Thread t = new Thread(r);
    t.start();
   
   for (int i = 0; i <10; i++) {
	   System.out.println("main thrad");
	
}
	}
}

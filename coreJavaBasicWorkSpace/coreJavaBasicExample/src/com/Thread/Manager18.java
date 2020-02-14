package com.Thread;

public class Manager18 {

	public static void main(String[] args) {
       
		Thread thread = new Thread()
		{
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		};
		
		thread.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
		//System.out.println("done");
	}
}

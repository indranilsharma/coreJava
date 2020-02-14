package com.Thread;

public class Manager17 {

	public static void main(String[] args) {

		class D17 implements Runnable {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		}
		D17 d17 = new D17();
		Thread thread = new Thread(d17);
		thread.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}
}

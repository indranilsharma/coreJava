package com.Thread;

public class Manager25 {

	public static Thread getThread() {
		return new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		});
	}

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		/*
		 * Thread thread2 = new Thread(); thread2.start();
		 */
		getThread().start();
		System.out.println("......");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

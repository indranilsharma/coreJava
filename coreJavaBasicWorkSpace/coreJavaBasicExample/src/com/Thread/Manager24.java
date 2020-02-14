package com.Thread;

public class Manager24 {

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
		Thread thread = new Thread(getThread());
		/*
		 * Thread thread2 = new Thread();
		 * thread2.start();
		 */
		thread.start();
		System.out.println("......");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

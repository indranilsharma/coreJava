package com.Thread;

public class Manager23 {

	public static Runnable getRunnable() {

		Runnable runnable = new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		};

		return runnable;

	}

	public static void main(String[] args) {
		Thread thread = new Thread(getRunnable());
		thread.start();
		System.out.println("......");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

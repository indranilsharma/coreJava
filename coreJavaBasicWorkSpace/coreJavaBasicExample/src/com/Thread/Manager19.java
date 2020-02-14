package com.Thread;

public class Manager19 {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
		// System.out.println("done");
	}
}

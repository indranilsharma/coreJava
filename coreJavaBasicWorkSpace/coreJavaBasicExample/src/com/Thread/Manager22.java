package com.Thread;

public class Manager22 {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		}).start();
		//thread.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}
}

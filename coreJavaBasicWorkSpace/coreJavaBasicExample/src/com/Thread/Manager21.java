package com.Thread;

public class Manager21 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		});
		thread.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}
}

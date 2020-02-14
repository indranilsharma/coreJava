package com.Thread;

public class Manager20 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		}.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
	}
}

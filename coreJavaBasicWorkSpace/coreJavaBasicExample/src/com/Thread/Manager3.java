package com.Thread;

class Threads8i implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager3 {

	public static void main(String[] args) {
		Threads8i threads2 = new Threads8i();
		Thread thread = new Thread(threads2);
		thread.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
	}
}

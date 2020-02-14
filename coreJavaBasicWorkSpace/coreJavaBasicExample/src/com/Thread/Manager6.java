package com.Thread;

class D6 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager6 {

	public static void main(String[] args) {
		D6 d6 = new D6();
		Thread thread = new Thread(d6);
		thread.start();
		D6 d62 = new D6();
		Thread thread2 = new Thread(d62);
		thread2.start();
		System.out.println("done");
	}

}

package com.Thread;

class D71 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class D7 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager7 {

	public static void main(String[] args) {
		D71 d71 = new D71();
		d71.start();
		D7 d7 = new D7();
		Thread thread = new Thread(d7);
		thread.start();
		System.out.println("done");
	}

}

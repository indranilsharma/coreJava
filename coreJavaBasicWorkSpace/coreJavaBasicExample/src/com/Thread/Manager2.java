package com.Thread;

class Threads1 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager2 {

	public static void main(String[] args) {
		Threads1 threads1 = new Threads1();
		threads1.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}

}

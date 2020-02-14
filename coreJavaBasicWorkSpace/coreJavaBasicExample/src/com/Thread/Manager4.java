package com.Thread;

class Threads3 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class Threads4 extends Thread {
	public void run() {
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager4 {

	public static void main(String[] args) {
		Threads3 threads3 = new Threads3();
		threads3.start();
		threads3.stop();
		Threads4 threads4 = new Threads4();
		threads4.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
		
	}

}

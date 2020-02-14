package com.Thread;

class D5 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager5 {

	public static void main(String[] args) {
		D5 d5 = new D5();
		d5.start();
		D5 d52 = new D5();
		d52.start();
		System.out.println("done");
	}

}

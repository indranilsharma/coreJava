package com.Thread;

class D14 extends Thread {

	public D14() {
		start();
	}

	public void run() {
		System.out.println("chileld begain");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		System.out.println("chileld begain");
	}
}

public class Manager14 {

	public static void main(String[] args) {
		D13 d13 = new D13();
		d13.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

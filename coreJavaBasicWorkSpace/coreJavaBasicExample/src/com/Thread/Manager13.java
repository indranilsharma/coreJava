package com.Thread;

class D13 extends Thread {

	public D13() {
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

public class Manager13 {

	public static void main(String[] args) {
		D13 d13 = new D13();
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

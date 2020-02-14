package com.Thread;

class D15 extends Thread {

	public D15() {
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

public class Manager15 {

	public static void main(String[] args) {
		D15 d15 = new D15();
		d15.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

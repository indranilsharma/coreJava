package com.Thread;

class D10 extends Thread {
	public void run() {
		System.out.println("chileld begain");
		int i = 10 / 0;
		System.out.println("chileld begain");
	}
}

public class Manager10 {

	public static void main(String[] args) {
		D10 d10 = new D10();
		d10.start();
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

package com.Thread;

class D11 extends Thread {
	public void run() {
		System.out.println("chileld begain");
		int i = 10 / 0;
		System.out.println("chileld begain");
	}
}

class A11 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager11 {

	public static void main(String[] args) {
		D11 d11 = new D11();
		d11.start();
		A11 a11 = new A11();
		a11.start();
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

package com.Thread;

class D12 extends Thread {
	public void run() {
		System.out.println("chileld begain");
		// int i = 10 / 0;
		System.out.println("chileld begain");
	}
}

public class Manager12 {

	public static void main(String[] args) {
		D12 d12 = new D12();
		d12.start();
		/*
		 * A11 a11 = new A11(); a11.start();
		 */
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

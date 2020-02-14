package com.Thread;

public class Manager16 {

	public static void main(String[] args) {

		class D16 extends Thread {

			public void run() {
				// System.out.println("chileld begain");
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
				// System.out.println("chileld begain");
			}
		}

		D16 d16 = new D16();
		d16.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}
}

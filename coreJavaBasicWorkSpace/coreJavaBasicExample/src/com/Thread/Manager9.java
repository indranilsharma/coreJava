package com.Thread;

class D9 extends Thread {
	public void run() {
		int i = 10 / 0;
		System.out.println("end of c");
	}
}

public class Manager9 {

	public static void main(String[] args) {
		D9 d9 = new D9();
		d9.start();
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("done");
	}

}

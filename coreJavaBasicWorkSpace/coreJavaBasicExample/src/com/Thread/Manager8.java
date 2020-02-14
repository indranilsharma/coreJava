package com.Thread;

class D8 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager8 {

	public static void main(String[] args) {
		D8 d8 = new D8();
		d8.start();
		System.out.println("............");
		//D5 d52 = new D5();
		d8.start();
		System.out.println("done");
	}

}

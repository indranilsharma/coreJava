package com.Thread;
//2nd way
public class Manager26 {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}

			}
		})

		{
			public void run() {
				System.out.println("thread");
			}
		}.start();
	}

}

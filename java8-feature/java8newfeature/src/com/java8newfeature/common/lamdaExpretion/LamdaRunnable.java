package com.java8newfeature.common.lamdaExpretion;

public class LamdaRunnable {
	public static void main(String[] args) {
	
		Thread myThreadAnonamuos = new Thread(new Runnable() {

			public void run() {
				System.out.println("myThread implemented via anonamous innerclass");
			}
		});

		myThreadAnonamuos.start();

		Thread myThreadLamda = new Thread(
				// no need to set new runnable target and no need override run method
				() -> System.out.println("myThread implemented via"
						+ " lamda thats why 'new Runnale() boiler plate code also remove'"));
		myThreadLamda.start();
	}
}
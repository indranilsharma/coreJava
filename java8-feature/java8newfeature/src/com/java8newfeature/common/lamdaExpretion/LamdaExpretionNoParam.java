package com.java8newfeature.common.lamdaExpretion;

@FunctionalInterface
interface Demo {
	public void show();
}

public class LamdaExpretionNoParam {

	public static void main(String[] args) {
		Demo demo = () -> {
			System.out.println("I ");
		};
		demo.show();
		// System.out.println(demo.show());
	}

}

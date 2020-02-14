package com.opps.innerClas;

public class Manager6 {
	public static void main(String[] args) {
		int i = 10;
		final int j = 20;

		class InnerA {
			void test() {
				System.out.println("test()");
			}
		}
		System.out.println("done");
	}
}

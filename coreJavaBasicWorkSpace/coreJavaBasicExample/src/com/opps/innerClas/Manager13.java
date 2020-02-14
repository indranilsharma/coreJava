package com.opps.innerClas;

public class Manager13 {
	public static void main(String[] args) {
		A9 a9 = new A9() {

			void test1() {
				System.out.println("test-1-inner");
			}

			void test2() {
				System.out.println("test-1-inner");
			}
		};
		a9.test1();
		a9.test2();
		System.out.println("done");

	}
}

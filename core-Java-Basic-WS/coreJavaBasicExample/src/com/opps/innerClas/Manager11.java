package com.opps.innerClas;

public class Manager11 {
	public static void main(String[] args) {
		A10 a10 = new A10();
		A10 a102 = new A10() {
			void test1() {
				System.out.println("test1");
			}
		};
		a10.test1();
		a10.test2();
		a102.test1();
		a102.test2();
	}
}

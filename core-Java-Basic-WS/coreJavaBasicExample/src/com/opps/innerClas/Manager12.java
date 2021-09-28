package com.opps.innerClas;

public class Manager12 {
	public static void main(String[] args) {
		A10 a10 = new A10() {

		};

		a10.test1();
		a10.test2();
		System.out.println(".....");

		A9 a9 = new A9() {
			void test1() {
				System.out.println("test1");
			}
		};

		a9.test1();
		a9.test2();
		System.out.println("........");

		A10 a102 = new A10() {
			void test1() {                                   //proparty mention in main class
				System.out.println("test-3");
			}

			void test2() {
				System.out.println("test-4");
			}
			
		};

		a102.test1();
		a102.test2();
	}
}

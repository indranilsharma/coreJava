package com.opps.innerClas;

public class Manager7 {
	public static void main(String[] args) {

		class InnerB {
			void test() {
				System.out.println("test()");
			}
		}
		InnerB b = new InnerB();
		b.test();
		System.out.println("....");
		b.test();
		System.out.println(".....");
		System.out.println("done");
	}
}

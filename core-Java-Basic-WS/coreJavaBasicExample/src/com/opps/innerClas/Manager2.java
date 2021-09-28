package com.opps.innerClas;

class OuterCall {

	private class Inner {
		private int a = 10;

		private void print() {
			System.out
					.println("insteed of study we can enjoy our life if we had dollar");
		}
	}

	public  void call() {
		Inner obj2 = new Inner();
		System.out.println(obj2.a);
		obj2.print();
	}
}

public class Manager2 {
	public static void main(String[] args) {
		
	}
}
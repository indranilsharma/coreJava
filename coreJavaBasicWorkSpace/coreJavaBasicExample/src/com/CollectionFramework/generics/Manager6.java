package com.CollectionFramework.generics;

class G<C> {
	C attr;

	G(C attr, int i) {
		this.attr = attr;
	}
}

public class Manager6 {
	public static void main(String[] args) {
		G<String> obj = new G<String>("India", 20);
		G<Integer> obj1 = new G<Integer>(200, 20);
		G<Double> obj52 = new G<Double>(222.2, 20);
		System.out.println("done");
	}
}

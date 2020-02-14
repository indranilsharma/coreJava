package com.CollectionFramework.generics;

class X<Y> {
	Y i;
}

public class Manager9 {
	public static void main(String[] args) {
		X<?> t1 = null;
		t1 = new X<Integer>();
		t1 = new X<String>();
		// t1 = new X<Double>();
		// t1 = new X<Float>();
		t1 = new X<Number>();
		t1 = new X<Object>();
		
	}

}

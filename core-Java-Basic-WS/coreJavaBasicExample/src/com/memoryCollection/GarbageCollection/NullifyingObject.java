package com.memoryCollection.GarbageCollection;

public class NullifyingObject {
	NullifyingObject i;

	public static void main(String[] args) {
		
		NullifyingObject o1 = new NullifyingObject();
		NullifyingObject o2 = new NullifyingObject();
		NullifyingObject o3 = new NullifyingObject();

		o1.i = o2;
		o2.i = o3;
		o3.i = o1;
		Runtime.getRuntime().gc();
		System.out.println(Runtime.getRuntime().freeMemory());
//		object eligible for gc
		o1 = null;
		System.out.println(Runtime.getRuntime().freeMemory());
		o2 = null;
//		after this 3 object eligible for gc
		System.gc();
		System.out.println(Runtime.getRuntime().freeMemory());
		o3 = null;
	}

}

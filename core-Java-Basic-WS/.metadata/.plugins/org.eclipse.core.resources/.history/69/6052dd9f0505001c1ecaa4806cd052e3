package com.memoryCollection.GarbageCollection;

public class FinalizedDemo {

	public static void main(String[] args) {
//		ot make eligible for gc() string class finalize () called  
//		String s = new String("India");
		FinalizedDemo s = new FinalizedDemo();
		s = null;
		System.gc();
//		System.out.println();
		System.out.println(Runtime.getRuntime().freeMemory());
		
//		default method for finalization
		Runtime.getRuntime().runFinalization();
		System.runFinalization();
		
		System.out.println(Runtime.getRuntime().freeMemory());

	}
	public void finalize() {
		System.out.println("finalize method called ");
	}
}

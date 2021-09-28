package com.memoryCollection.GarbageCollection;

public class FinalizedDemo2 {
	static FinalizedDemo2 obj1;

	public static void main(String[] args) throws InterruptedException {
		
		FinalizedDemo2 obj2 = new FinalizedDemo2();
		System.out.println(obj2.hashCode());
		
		obj2 = null;
		System.gc();
		Thread.sleep(20000);
		System.out.println(obj1.hashCode());

		obj1 = null;
//		only one time finalize method call even object eligible for gc() 
		System.gc();
		Thread.sleep(20000);
		System.out.println("end of main ");

	}

	public void finalize() {
		System.out.println("finalize method called ");
		obj1 = this;
	}
}
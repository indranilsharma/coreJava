package com.memoryCollection.GarbageCollection;

//Reassigning a Reference Variable to remove a reference to an object : Garbage Collection 
public class Manager4 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("goodbye");
		System.out.println(s1);
//		at this point no one eligible for gc() 
		System.gc();
		System.out.println(Runtime.getRuntime().freeMemory());
		// At this point the StringBuffer "hello" is not eligible
		s1 = s2;
		System.gc();
		// Now the StringBuffer "hello" is eligible for collection
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}

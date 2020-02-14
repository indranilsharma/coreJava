package com.memoryCollection.GarbageCollection;

//To remove a reference to an object is to set the reference variable to null. : Garbage Collection

public class Manager3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		sb = null;
		// Now the StringBuffer object is eligible for collection
	}
}

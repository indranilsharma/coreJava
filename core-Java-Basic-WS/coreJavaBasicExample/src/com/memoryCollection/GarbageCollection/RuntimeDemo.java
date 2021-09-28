package com.memoryCollection.GarbageCollection;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("totalMemory :"+r.totalMemory());
		System.out.println("freeMemory :"+r.freeMemory());
		for (int i = 0; i < 1000; i++) {
			Date d = new Date();
			d = null;
		}
		System.out.println("freeMemory :"+r.freeMemory());
//		 one way to call garbage collector  by runtime 
		r.gc();
		System.out.println("freeMemory : by runtime "+r.freeMemory());
//		one way to call garbage collector by system 
		System.gc();
		System.out.println("freeMemory : bt system "+r.freeMemory());
	}

}

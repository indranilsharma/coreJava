package com.deepak.jvm;

public class HeapDemo {
public static void main(String[] args) {
	double mb=1024*1024;
	Runtime r=Runtime.getRuntime();
	System.out.println("Max Memory :: "+r.maxMemory()/mb);
	System.out.println("Total Memory :: "+r.totalMemory()/mb);
	System.out.println("Free Memory :: "+r.freeMemory()/mb);
	System.out.println("Consumed Memory :: "+((r.totalMemory()/mb)-(r.freeMemory()/mb)));
	System.out.println("availableProcessors ::"+r.availableProcessors());
	Thread t1 = new Thread();
	System.out.println("t1.currentThread().getName()::"+t1.currentThread().getName());
}
}

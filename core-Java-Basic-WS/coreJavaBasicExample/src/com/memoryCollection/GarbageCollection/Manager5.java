package com.memoryCollection.GarbageCollection;

import java.util.Date;

/*
 If an object is returned from the method, its reference
 might be assigned to a reference variable; : Garbage Collection
*/

public class Manager5 {

	public static void main(String[] args) {
		Date d = getDate();
		System.out.println("d = " + d);
	}

	public static Date getDate() {
		Date d2 = new Date();
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println(now);
		return d2;
	}
}
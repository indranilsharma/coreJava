package com.deepak.java8Features;
import java.util.*;
import java.util.function.Supplier;
public class Supplier_test {

	public static void main(String[] args) {
		Supplier<Date> s =()->new Date();
		System.out.println(s.get());

	}

}

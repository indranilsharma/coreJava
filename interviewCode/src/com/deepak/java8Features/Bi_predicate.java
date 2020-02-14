package com.deepak.java8Features;
import java.util.function.*;

public class Bi_predicate {

	public static void main(String[] args) {
	BiPredicate<Integer , Integer> p=(a,b)->(a+b)%2==0;
	System.out.println(p.test(10, 20));
	System.out.println(p.test(10, 21));

	}

}

package com.java8newfeature.common.lamdaExpretion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaException {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 9, 7, 0, 10, 20);

		
		//by try catch and 
		list.forEach((i) -> {
			try {
				System.out.println(50 / i);

			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		});

		//call particular method
		list.forEach(lamdaWrapper((i) -> {
			System.out.println(i);
		}));
	}

	
	//by consumer interface 
	static Consumer<Integer> lamdaWrapper(Consumer<Integer> consumer) {

		return i -> {
			try {
				consumer.accept(50/i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
}

package com.java8newfeature.common.methodrefarence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//call by value
//call by method
public class Methodrefarence {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("sharma", "gupta", "iyer");

		System.out.println("Anonymous inner class\n");
		// Anonymous inner class
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);

			}
		};
		list.forEach(consumer);

		
		System.out.println("\nlamda style\n");
		// lamda style

		list.forEach(s -> System.out.println(s));

		
		System.out.println("\nmethod reference style\n");
		// method reference style

		list.forEach(System.out::println);
	}

}
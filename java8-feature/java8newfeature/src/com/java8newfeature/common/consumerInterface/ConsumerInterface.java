package com.java8newfeature.common.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 88, 5, 41);

		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		list.forEach(consumer);

		Consumer<Integer> consumerLamda = (Integer i) -> {
			System.out.println(i);
		};
		System.out.println("consumerLamda");
		list.forEach(consumerLamda);

		Consumer<Integer> withoutconsumerLamda = i -> System.out.println(i);

		System.out.println("with out consumerLamda");
		list.forEach(withoutconsumerLamda);

		System.out.println("single line");
		list.forEach(i -> System.out.println(i));

	}

}
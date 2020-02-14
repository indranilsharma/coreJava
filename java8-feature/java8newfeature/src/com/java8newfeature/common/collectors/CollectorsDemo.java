package com.java8newfeature.common.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8newfeature.common.streamApI.Product;

public class CollectorsDemo {
	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(1, "HP Laptop", 25000f), new Product(2, "Dell Laptop", 35000f),
				new Product(3, "Apple Laptop", 45000f), new Product(3, "Lenevo Laptop", 28000f));

		//List<Product> product = 
		Long noOfElements =	  list.stream().collect(Collectors.counting());
		System.out.println(noOfElements);

	}
}
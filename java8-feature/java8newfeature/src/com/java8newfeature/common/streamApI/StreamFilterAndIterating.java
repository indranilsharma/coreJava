package com.java8newfeature.common.streamApI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndIterating {

	public static void main(String[] args) {
		List<Product> list = Arrays.asList(new Product(1, "HP Laptop", 25000f), new Product(2, "Dell Laptop", 35000f),
				new Product(3, "Apple Laptop", 45000f), new Product(3, "Lenevo Laptop", 28000f));

        //filter is a intermediate method 	
		 list.stream().filter(p-> p.price <35000).forEach(p -> System.out.println(p.name+"\n"));
		
		
		 //only filter 
		 List<Float> f = list.stream().filter(p -> p.price > 35000).map(p->p.price).collect(Collectors.toList());
         System.out.println(f);
		
		//Max price 
		Product pMax = list.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(pMax.name+" "+pMax.price);
		
		//Min price
		Product pMin = list.stream().min((p1,p2)-> p1.price < p2.price ? 1:1).get();
		System.out.println(pMin.name+" "+pMin.price);
	}
}

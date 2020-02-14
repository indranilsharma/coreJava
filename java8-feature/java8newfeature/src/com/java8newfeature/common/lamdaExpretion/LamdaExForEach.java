package com.java8newfeature.common.lamdaExpretion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaExForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 50, 70, 100);
		List<String> strings = new ArrayList<>();
		strings.add("ram");
		strings.add("rahim");
		strings.add("ramen");
		list.forEach((i) -> System.out.println(i));
		strings.forEach((i) -> System.out.println(i));
	}

}

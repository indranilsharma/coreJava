package com.deepak.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Stream1 {

	public static void main(String[] args) {
		ArrayList<Integer>I = new ArrayList<>();
	   I.add(0);
	   I.add(2);
	   I.add(5);
	   I.add(8);
	   System.out.println(I);
	   List<Integer>I2 = I.stream().filter(i->i%2==0).collect(Collectors.toList());
	   System.out.println(I2);

	}

}

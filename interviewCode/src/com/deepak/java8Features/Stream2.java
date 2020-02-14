package com.deepak.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Stream2 {

	public static void main(String[] args) {
		ArrayList<Integer>marks = new ArrayList<>();
		marks.add(0);
		marks.add(2);
		marks.add(5);
		marks.add(8);
	   System.out.println(marks);
	   List<Integer>I2 = marks.stream().map(i->i+5).collect(Collectors.toList());
	   System.out.println(I2);

	}

}

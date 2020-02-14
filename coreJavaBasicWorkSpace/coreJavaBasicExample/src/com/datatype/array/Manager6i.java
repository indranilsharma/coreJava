package com.datatype.array;

public class Manager6i {
	public static void main(String[] argv) {
		String[][] s = new String[20][30];
		// The above notation is also equivalent to the following:

		s = new String[20][];
		for (int i = 0; i < 20; ++i){
			s[i] = new String[30];
		System.out.println(s.toString());
		System.out.println(s[i].toString());
		}
	}
}

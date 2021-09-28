package com.allKeyword.Final.variable;

public class TesstRefarenceFinal {

	/*
	 * When a final variable is a reference to an object, then this final
	 * variable is called reference final variable. Note that this is not
	 * re-assigning. This property of final is called non-transitivity.
	 */
	public static void main(String[] args) {

		final StringBuffer sb = new StringBuffer("India");
		System.out.println(sb);
		System.out.println(sb.append(" will overcome"));
	}

}

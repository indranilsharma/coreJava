package com.datatype.Literal.string.OCAJP_String;

public class Mask_Credit_Card {
	public static String mask(String creitCard) {
		String s = "XXXX-XXXX-XXXX-";
		return s + creitCard.substring(15, 19);
	}

	public static void main(String[] args) {
		System.out.println(mask("4528-3252-4546-8454"));
	}

}
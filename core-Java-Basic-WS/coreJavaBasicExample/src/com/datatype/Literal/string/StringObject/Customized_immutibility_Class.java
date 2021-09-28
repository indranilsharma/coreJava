package com.datatype.Literal.string.StringObject;

//if change in the content every time new object will be created  
public class Customized_immutibility_Class {
	private int i;

	Customized_immutibility_Class(int i) {
		this.i = i;
	}

	public Customized_immutibility_Class modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new Customized_immutibility_Class(i);
		}
	}

	public static void main(String[] args) {

		String s = new String("Kabul");
		String s1 = new String("Kabul");

//		it is for reference comparison
		System.out.println(s == s1);
//		it is for content comparison in string class
//		in object class equals method are for reference comparison
		System.out.println(s.equals(s1));

//		this object eligible for gc()
		s.concat("Afganistan");
		System.out.println(s);
		
		Customized_immutibility_Class i1 = new Customized_immutibility_Class(10);
		Customized_immutibility_Class i2 = i1.modify(100);
		Customized_immutibility_Class i3 = i1.modify(10);
		
		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		
	}
}

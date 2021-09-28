package com.JavaLang.equals;

class Customer {
	String name;
	int demo_no;
	int amt;

	public Customer(String name, int demo_no, int amt) {
		this.name = name;
		this.demo_no = demo_no;
		this.amt = amt;
	}

}

public class EqualsDemo_ObjectClass {

	public static void main(String[] args) {

// object class equals are meant for reference comparison not value comparison

		Customer c1 = new Customer("Indranil", 101, 20000);
		Customer c2 = new Customer("Indranil", 101, 20000);
		Customer c3 = new Customer("Rockey", 1001, 50000);
		Customer c4 = new Customer("Rob", 5001, 30000);

//only object class equals are meant for reference comparison not value comparison

		c3 = c4;
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
	}

}
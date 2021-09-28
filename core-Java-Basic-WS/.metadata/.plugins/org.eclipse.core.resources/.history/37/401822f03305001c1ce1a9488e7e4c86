package com.JavaLang.equals;

class Customer_Override {
	String name;
	int demo_no;
	int amt;

	public Customer_Override(String name, int demo_no, int amt) {
		this.name = name;
		this.demo_no = demo_no;
		this.amt = amt;
	}

//	 override equals method 
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
			}
		if (obj instanceof Customer_Override) {
			Customer_Override c = (Customer_Override) obj;

			if ((name.equals(c.name)) && (demo_no == c.demo_no) && (amt == c.amt)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}

public class EqualsDemo_Override {

	public static void main(String[] args) {

// object class equals are meant for reference comparison not value comparison

		Customer_Override c1 = new Customer_Override("Indranil", 101, 20000);
		Customer_Override c2 = new Customer_Override("Indranil", 101, 20000);
		Customer_Override c3 = new Customer_Override("Rockey", 1001, 50000);
		Customer_Override c4 = new Customer_Override("Rob", 5001, 30000);

//only object class equals are meant for reference comparison not value comparison

		c3 = c4;
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(c3.equals("ShamSteel"));
		System.out.println(c3.equals(null));
	}
}

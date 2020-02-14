package com.opps.constractor;

class Manager12 {
	static {
		System.out.println("SIB1");
	}
	static {
		System.out.println("SIB2");
	}

	Manager12() {
		System.out.println("Manager12()");
	}

	Manager12(int i) {
		this();
		System.out.println("Manager12()");
	}

	public static void main(String[] args) {
     Manager12 manager12 = new Manager12();
     System.out.println("....");
     Manager12 manager122 =new Manager12(2);
     System.out.println("......");
	}
}

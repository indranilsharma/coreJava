package com.allKeyword.IIB;

class Init {

	static int x;
	int y;
	
	static {
		x = 7;
		System.out.println("Static" + x);
	}
	
	{
		y = 8;
		System.out.println("IIB manager2"+y);
	}
}

class Manager2 extends Init {
	
	static {
		System.out.println("1st static init");
	}

	static {
		System.out.println("2nd static init");
	}
	
	{
		System.out.println("1st instance init");
	}
	
	{
		System.out.println("2nd instance init");
	}
	
	Manager2(int x) {
		System.out.println("1-arg const");
	}

	Manager2() {
		System.out.println("no-arg const");
	}

	
	public static void main(String[] args) {
		new Manager2();
		System.out.println(".................");
		new Manager2(7);
	}
}
package com.deepak.java8Features;

public class AndroidPhone implements Phone {
	public void call() {
		System.out.println("calling");
	}

	@Override
	public void massage() {
	
		
	}
	public static void main(String[] args) {
		AndroidPhone a = new AndroidPhone();
		a.massage();
	}
}

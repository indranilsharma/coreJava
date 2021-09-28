package com.opps.Interfaces;

interface B {
	int add(int i);
}

interface A {
	void sum();
}

abstract class Abs
{
  public abstract void priynka();
}

public class Manager10 extends Abs implements B, A {
	public void sum() {
		System.out.println("hi");
	}

	public int add(int i) {
		System.out.println("hi--");
		return 50; 
	}

	public static void main(String[] args) {
		// A obj=new A();
		Manager10 obj = new Manager10();
		int i=obj.add(4);
		obj.sum();
		System.out.println(i);
	}

	@Override
	public void priynka() {
     System.out.println("i dont like study");		
	}

}

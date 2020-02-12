package com.deepak.objectCreationWays;

public class ByCloneMethod implements Cloneable {
	String str="test";
	public void fun() {
		
		System.out.println("Object creation by clone method: "+str);
	}
	public Object clone() throws CloneNotSupportedException{
		ByCloneMethod b1 = new ByCloneMethod();
		b1.fun();
		return b1;
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ByCloneMethod obj = new ByCloneMethod();
		ByCloneMethod obj1 = (ByCloneMethod) obj.clone();
		obj1.fun();
		obj.fun();
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
	}
}

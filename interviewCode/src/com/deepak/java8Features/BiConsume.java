package com.deepak.java8Features;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee1
{
	String name;
	public double salary;
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class BiConsume {	
public static void main(String[] args) {
	ArrayList<Employee1>l =new ArrayList<Employee1>();
	poputale(l);
	BiConsumer<Employee1 ,Double>c=(e,d)->e.salary=e.salary+d;
	for(Employee1 e:l)
	{
		c.accept(e,(double) 500);
	}
	for(Employee1 e:l)
	{
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println("-----------------------");
	}
	
}

private static void poputale(ArrayList<Employee1> l) {
	l.add(new Employee1("ram",2000));
	l.add(new Employee1("rashm",200));
	l.add(new Employee1("rafffm",2));
	
}
}

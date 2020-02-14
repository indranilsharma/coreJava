package com.deepak.java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;
class Employee{
	int eno;
	String name;
	
	public Employee(int eno, String name) {
	
		this.eno = eno;
		this.name = name;
	}
}

public class ByFunction {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
	BiFunction<Integer , String ,Employee> f=(eno,name)->new Employee(eno,name);
	l.add(f.apply(100,"Ravi"));
	l.add(f.apply(101,"Ravi"));
	l.add(f.apply(102,"Ravi"));
	l.add(f.apply(103,"Ravi"));
	for(Employee e:l)
	{
		System.out.println("employee number"+e.eno);
	}
	

	}

}

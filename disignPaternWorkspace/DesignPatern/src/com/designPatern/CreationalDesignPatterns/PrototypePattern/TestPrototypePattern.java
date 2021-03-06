package com.designPatern.CreationalDesignPatterns.PrototypePattern;

import java.util.List;

public class TestPrototypePattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		employee.loadData();
		Employee cloneObj1 = (Employee) employee.clone();
		Employee cloneObj2 = (Employee) employee.clone();
		List<String> listTemp1 = cloneObj1.getEmpList();
		listTemp1.add("bichug");
		List<String> listTemp2 = cloneObj2.getEmpList();
		listTemp2.remove("jack");
		System.out.println(employee.getEmpList() + ": employee");
		System.out.println(listTemp1 + ": listTemp1");
		System.out.println(listTemp2 + ": listTemp2");

	}
}

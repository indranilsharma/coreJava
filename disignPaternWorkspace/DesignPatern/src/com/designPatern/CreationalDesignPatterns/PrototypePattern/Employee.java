package com.designPatern.CreationalDesignPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
	@SuppressWarnings("unused")
	private List<String> empList;

	public List<String> getEmpList() {
		return empList;
	}

	public Employee() {
		empList = new ArrayList<>();
	}

	public Employee(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("jhon");
		empList.add("jack");
		empList.add("soso");
		empList.add("kutti");

	}

	@Override
	
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String string : this.getEmpList()) {
			temp.add(string);
		}
		return new Employee(temp);
	}
}

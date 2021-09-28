package com.opps.innerClas;

class Job {
	String title;
	double salary;

	public Job(String title, double salary) {
		this.title = title;
		this.salary = salary;
	}
}

class Employee {
	private int index;
	Job x[];

	Employee(Job x[]) {
		this.x = x;
	}

	Job nextJob() {
		return x[index++];
	}

	boolean hasNext() {
		if(index == x.length)
		{ 
			index = 0;
		return false;
		}
		return true;
	}
	
}

public class Manager {

	public static void main(String[] args) {
		Job j1 = new Job("se", 50000);
		Job j2 = new Job("admin", 30000);
		Job j3 = new Job("ba", 40000);
		Job x[] = { j1, j2, j3 };
		Employee emp = new Employee(x);
		print(emp);
		System.out.println(".....");
		

	}

	private static void print(Employee emp) {
		Job j1 = null;
		while (emp.hasNext()) {
			j1 = emp.nextJob();
			System.out.println(j1.title + "  " + j1.salary);

		}

	}
}

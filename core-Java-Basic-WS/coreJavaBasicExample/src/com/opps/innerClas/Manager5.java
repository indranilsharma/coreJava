package com.opps.innerClas;

class Job5 {
	String titel;
	double salary;

	Job5(String titel, double salary) {
		this.titel = titel;
		this.salary = salary;
	}
}

class Employee5 {
	private int index;
	Job5 x[];

	Employee5(Job5 x[]) {
		this.x = x;
	}

	Job5 nextJob() {
		return x[index++];
	}

	boolean hasNext() {
		if (index == x.length) {
			
			index = 0;
			return false;
		}
		return true;
	}
}

class Manager5 {
	public static void main(String[] args) {
		Job5 j1 = new Job5("software", 5000.9);
		Job5 j2 = new Job5("hardware", 3000.9);
		Job5 j3 = new Job5("hr", 500.9);
		Job5 x[] = { j1, j2, j3 };
		Employee5 emp = new Employee5(x);
		print(emp);
		System.out.println("....");
	}

	private static void print(Employee5 emp) {
		Job5 j1 = null;
		while (emp.hasNext()) {
			j1 = (emp.nextJob());
			System.out.println(j1.titel + ":" + j1.salary);
		}
	}
}
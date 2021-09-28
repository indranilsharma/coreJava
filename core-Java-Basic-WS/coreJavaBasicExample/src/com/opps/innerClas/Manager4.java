package com.opps.innerClas;

class Job1 {
	String titel;
	double salary;

	Job1(String titel, double salary) {
		this.titel = titel;
		this.salary = salary;
	}
}

class Employee1 {
	private int index;
	Job1 x[];

	Employee1(Job1 x[]) {
		this.x = x;
	}

	Job1 nextJob() {
		return x[index++];
	}

	boolean hasNext() {
		return index < x.length;
	}
}

class Manager4 {
	public static void main(String[] args) {
		Job1 j1 = new Job1("software", 5000.9);
		Job1 j2 = new Job1("hardware", 3000.9);
		Job1 j3 = new Job1("hr", 500.9);
		Job1 x[] = { j1, j2, j3 };
		Employee1 emp = new Employee1(x);
		print(emp);
		System.out.println("....");
	}

	private static void print(Employee1 emp) {
		Job1 j1 = null;
		while (emp.hasNext()) {
			j1 = (emp.nextJob());
			System.out.println(j1.titel + ":" + j1.salary);
		}
	}
}
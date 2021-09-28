package com.allKeyword.Static.Method;

public class Student {

	static String collName ;
	String stuName;
	int rollNum;

	static int counter ;

	public Student(String stuName) {
		this.stuName = stuName;
		this.rollNum = setRollNum(counter);
	}

	public int setRollNum(int counter) {
		return counter++;
	}

	public static void setCollName(String name) {
		Student.collName = name;
	}
	
	//instance method
	public void getStudentInfo() {
		System.out.print(this.stuName);
		System.out.print(" " +this.rollNum+" ");
		System.out.println(collName);
	}

	public static void main(String[] args) {
     
		Student.setCollName("Seacom");
		Student s = new Student("Ajay");
		Student s1 = new Student("Bijay");

		s.getStudentInfo();
		s1.getStudentInfo();
	}

}

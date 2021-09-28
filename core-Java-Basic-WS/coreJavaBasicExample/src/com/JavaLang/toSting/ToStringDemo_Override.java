package com.JavaLang.toSting;

class Student {
	String name;
	int id;

	public Student(String name, int id) {
//		super();
		this.name = name;
		this.id = id;
	}

//	object class implementation 
//	 public String toString() {
//	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	    }

//	customized representation of toString()
	@Override
	public String toString() {
		return name + "---" + id;
	}
}

public class ToStringDemo_Override {
	public static void main(String[] args) {
		Student s = new Student("Taliban", 101);
		Student s1 = new Student("USA", 102);
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s1.toString());
	}
}

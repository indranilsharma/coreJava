package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//parent is non serilizable 
class AccountInheritNonserilizable {
	String type = "SB";

//	data will be loss because it set as a transient 
	transient String pass = "montu123";

//	 no agr constuctor is must 
	AccountInheritNonserilizable() {
		System.out.println("AccountInheritNonserilizable() called");
	}
}

// this class not extending serialization but still serilizable because inherit serilization 
class PersonSerilizable extends AccountInheritNonserilizable implements Serializable {
	String name = "Gomes";
	int age = 77;

	PersonSerilizable() {
		System.out.println("PersonSerilizable()");
	}
}

public class Serialization_Inheritance_child {

	public static void main(String[] args) throws ClassNotFoundException {
		PersonSerilizable p = new PersonSerilizable();
		p.age = 100;
//		 non serilizable property not override 
		p.type = "CC";

		try {
			FileOutputStream fos = new FileOutputStream("xyz.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);

			FileInputStream fis = new FileInputStream("xyz.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonSerilizable p1 = (PersonSerilizable) ois.readObject();
			System.out.println(p1.type + " " + p1.pass + " " + p1.age + " " + p1.name);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

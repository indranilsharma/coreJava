package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AccountInherit implements Serializable {
	String type = "SB";

//	data will be loss because it set as a transient 
	transient String pass = "montu123";
}

// this class not extending serialization but still serilizable because inherit serilization 
class Person extends AccountInherit{
	String name = "Gomes";
	int age = 77;
} 
 
public class Serialization_Inheritance {

	public static void main(String[] args) {
		Person p = new Person();

		try {
			FileOutputStream fos = new FileOutputStream("xyz.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);

			FileInputStream fis = new FileInputStream("xyz.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			System.out.println(p.type + " " + p.pass + " " + p.age);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

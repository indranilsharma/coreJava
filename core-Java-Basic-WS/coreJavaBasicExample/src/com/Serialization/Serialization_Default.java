package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String name = "Montu";
//	data will be loss because it set as a transient 
	transient String pass = "montu123";
}

public class Serialization_Default {

	public static void main(String[] args) {
		Account a = new Account();

		try {
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);

			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Account account = (Account) ois.readObject();
			System.out.println(account.name + " ----- " + account.pass);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

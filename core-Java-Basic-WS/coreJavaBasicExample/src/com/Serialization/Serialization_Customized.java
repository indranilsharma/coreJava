package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AccountCust implements Serializable {
	String name = "Montu";

//	data will be loss because it set as a transient 
	transient String pass = "montu123";

//	defult value will be '0' ..if customized serialization happened 
	transient int pin = 124;

//	customized serialization applied  because of these method 
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String ecryPwd = 123 + pass;
		int ecryPin = 99 + pin;
		oos.writeObject(ecryPwd);
		oos.writeInt(ecryPin);
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		String ecryPwd = (String) ois.readObject();
	    int ecryPin = ois.readInt();
		pass = ecryPwd.substring(3);
		pin = ecryPin - 99;
	}
}

public class Serialization_Customized {

	public static void main(String[] args) {
		AccountCust a = new AccountCust();

		try {
			FileOutputStream fos = new FileOutputStream("xyz.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			System.out.println(a.name + " " + a.pass + " " + a.pin);

			FileInputStream fis = new FileInputStream("xyz.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			AccountCust account = (AccountCust) ois.readObject();
			System.out.println(account.name + " ----- " + account.pass+"------"+account.pin);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

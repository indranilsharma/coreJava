package com.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomizedSerialVersionUID_Receiver {
//	int j = 100;
//	private static final long serialVersionUID = 101L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("cust.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomizedSerialVersionUID_Class readObject = (CustomizedSerialVersionUID_Class) ois.readObject();
		System.out.println(readObject.i + " " + readObject.s +"  "+readObject.j );
	}
}

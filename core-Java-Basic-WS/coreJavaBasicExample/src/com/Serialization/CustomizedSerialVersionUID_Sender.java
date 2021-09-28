package com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomizedSerialVersionUID_Sender {
	public static void main(String[] args) throws IOException {
		CustomizedSerialVersionUID_Class obj = new CustomizedSerialVersionUID_Class();
		FileOutputStream fos = new FileOutputStream("cust.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("Serilization complete");
	}
}

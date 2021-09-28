package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// class must implement Serializable
class Ind implements Serializable {

	int i = 10;
	transient int j = 20;
}

class Pak implements Serializable {

	int k = 100;
	final int l = 200;
}

class Ban implements Serializable {

	int m = 50;
	static int n = 250;
}

class Sl implements Serializable {

	int o = 110;
	transient int p = 220;
}

public class SerializeDemo_multiple_object {
	public static void main(String[] args) throws Exception {

		Ind d = new Ind();
		Pak c = new Pak();
		Ban r = new Ban();
		Sl m = new Sl();

		System.out.println("Process of Serialization");

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		oos.writeObject(m);

		System.out.println("-------------");

		System.out.println("Process of deserialization");

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object readObject = ois.readObject();

		
		for (int i = 0; i<=3; i++) {
			if (readObject instanceof Ind) {
				Ind d2 = (Ind) readObject;
				System.out.println(d2.i + " " + d2.j);
			} else if (readObject instanceof Pak) {
				Pak c2 = (Pak) readObject;
				System.out.println(c2.k + " " + c2.l);
			} else if (readObject instanceof Ban) {
				Ban r2 = (Ban) readObject;
				System.out.println(r2.m + " " + r2.n);
			} else if (readObject instanceof Sl) {
				Sl m2 = (Sl) readObject;
				System.out.println(m2.o + " " + m2.p);
			} else {
				System.out.println("not in the list");
			}
		}
		
	}
}
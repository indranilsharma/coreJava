package com.allKeyword.transientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable {

	private static final long serialVersionUID = 1L;

	int i = 40, j = 50;

	// original value overlook
	transient int k = 40;

	/*
	 * Since static fields are not part of state of the object, there is no
	 * impact of using transient keyword with static variables. However
	 */

	transient static int l = 70;

	/*
	 * final variables are directly serialized by their values, so there is no
	 * use/impact of declaring final variable as transient
	 */
	transient final static int n = 20, o = 30;

	public static void main(String[] args) {

		Test obj = new Test();

		try {
			FileOutputStream outputStream = new FileOutputStream("abc.txt");
			ObjectOutputStream stream = new ObjectOutputStream(outputStream);
			stream.writeObject(obj);

			FileInputStream fileInputStream = new FileInputStream("abc.txt");
			ObjectInputStream stream2 = new ObjectInputStream(fileInputStream);
			Test readObject = (Test) stream2.readObject();

			System.out.println("i member variable " + readObject.i + "j memeber variable " + readObject.j);
			System.out.println("k transient variable " + readObject.k);

			System.out.println("l transient static variable " + readObject.l);
			System.out.println("n transient static final variable " + readObject.n);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

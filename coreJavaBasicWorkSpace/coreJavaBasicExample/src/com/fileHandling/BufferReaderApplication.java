package com.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderApplication {
	public static void main(String[] args) {
		String string = "";
		try {
			BufferedReader bf = new BufferedReader(
					new FileReader("/home/indranils@sawridge.com/Desktop/paid_dtls"));
			while ((string = bf.readLine()) != null) {
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			System.err.println("unable to find");
			//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println("unable to convert");
		}
	}
}

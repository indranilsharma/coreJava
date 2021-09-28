package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileToByteArray {

	public void callMethod() {
		String file = ("/home/indranils@sawridge.com/scjp-code-interview/scjpCode/resources/paid_dtls");
		InputStream is = null;

		try {
			is = new FileInputStream(file);
			byte content[] = new byte[2 * 1024];
			int readCount = 0;

			while ((readCount = is.read(content)) > 0) {
				System.out.println(new String(content, 0, readCount - 1));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {

			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		FileToByteArray call = new FileToByteArray();
		call.callMethod();
	}
}

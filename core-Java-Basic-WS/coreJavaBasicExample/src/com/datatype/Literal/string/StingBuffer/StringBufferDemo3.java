package com.datatype.Literal.string.StingBuffer;

public class StringBufferDemo3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//		chain method --method are executed from left to write 
		sb.append("BRICS").append("G7").append("G20").reverse().insert(5, "--").delete(9, 10).reverse()
				.replace(5, 6, "&&").indexOf("7", 10);
		System.out.println(sb);
	}
}

package com.datatype.Literal.string.StingBuffer;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		 StringBuffer sbnew = new StringBuffer("IndiaAustraliya");
//		(sbnew.lenght+16)
		System.out.println(sbnew.capacity());
//		if empty constructor it will be 16 default 
		StringBuffer sbdefault = new StringBuffer();
		System.out.println(sbdefault.capacity());
		
//		even though final we can change in the same object 
//		but not in the reassignment  
		sbnew.append("Taliban");
		System.out.println(sbnew);

//		The final local variable sb cannot be assigned.
//		It must be blank and not using a compound assignment
//		sb = new StringBuffer("Not possible");

//		initial capacity here case 31--upto this we add 31 char 
//		in this case overflow 31 so 
		sbnew.append("abcdefghi");
		System.out.println("sbnew " + sbnew);
		System.out.println(sbnew.capacity());
		
//		(currentcapacity+1)*2
//		if i add single char it will become (31+1)*2=64
		sbnew.append("A");
		System.out.println(sbnew+ "   "+sbnew.capacity());
		
//		add specific location 
		sbnew.insert(31, "*****");
		System.out.println(sbnew);
		
		sbnew.deleteCharAt(33);
		System.out.println(sbnew);
		System.out.println(sbnew.reverse());
		
		StringBuffer sb = new StringBuffer("ABCD-EFGHI");
		System.out.println(sb);
		sb.setLength(4);
		System.out.println(sb);
//		on the fly we can increased capacity 
		sb.ensureCapacity(50);
		sb.trimToSize();
		System.out.println(sb);
	}
}

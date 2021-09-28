package com.datatype.Literal.string.OCAJP_String;

public class Demo {

	public static void main(String[] args) {

//1---		---MUTIBILITY-------
		String s = new String("Kasmir");
//		automatically applicable for garbage collection
//		 new object("KasmirHeaven") will be created so immutable(unchangeable)
		s.concat("Heaven");
		System.out.println(s);

//1---		---MUTIBILITY-------
		StringBuffer sb = new StringBuffer("Kasmir");
//		operate on a same object--no new object will be created--so mutable(changeable)
		sb.append("Heaven");
		System.out.println(sb);

//2----		equals() and ==  
		String s1 = new String("Anada");
		String s2 = new String("Anada");
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true

//		equals() and ==  
		String s7 = new String( "Anada");
		String s8 = new String( "Anada");
		
		StringBuffer sb1 = new StringBuffer("Anada");
		StringBuffer sb2 = new StringBuffer("Anada");
		
		System.out.println(s7 == s8);//false
		System.out.println(s7.equals(s8));//true
		
		System.out.println(sb1 == sb2);// false
//		equals() are not overridden for content comparison
		System.out.println(sb1.equals(sb2));// false

//		incomparable type string and stringBuffer
//		System.out.println(s7 == sb1);
//		it will not do any operation simply return false
		System.out.println(s7.equals(sb2));
		
//3------final and immutability
		final StringBuffer sb3 = new StringBuffer("You can");
		sb3.append(" Win");
		System.out.println(sb3);

//		Without reference variable object applicable for garbage collection
		String t1 = "A";
		t1 = t1.concat("B");// AB
		String t2 = "C";// C
		t1 = t1.concat(t2);// ABC
//		but no reference variable for this automatically applicable for garbage collection
		t1.replace("C", "D");// ABD
		t1 = t1.concat(t2);// ABCC
		System.out.println(t1);

//4-----		trim() never remove blank spaces middle of the string 
		String sTream = "Power of Subconcious mind";// 22+3(space)
//		never remove blank space
		System.out.println(sTream.trim().length());
		System.out.println(sTream.indexOf(" "));

//5-----	Heap and SCP
//		 2 objecet will be created one in heap one in SCP 
		String s4 = "Java";
		String s5 = new String("java");
		System.out.println(s4 == s5);
		System.out.println(s4.equalsIgnoreCase(s5));
//		for s4 new object will created in heap area 
//		so return false because two object are present 
		System.out.println(s4.toLowerCase() == s5.toLowerCase());

//6---	StirngBuilder  
		StringBuilder sbd = new StringBuilder("Platinum");
		String st1 = sbd.toString();
		System.out.println(sbd.toString().equals(st1));
	}
}
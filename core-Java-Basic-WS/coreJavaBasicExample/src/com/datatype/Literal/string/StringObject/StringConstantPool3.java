package com.datatype.Literal.string.StringObject;

public class StringConstantPool3 {

	public static void main(String[] args) {
		String s1 = new String("You can not change me");
		String s2 = new String("You can not change me");

//       after this line 3 object will be created 2 in the heap area one in the SCP 
//		 2 time it will not created SCP area because one object already created

//		false because two object created in heap area  
		System.out.println(s1 == s2);// false

//		 new object will not created because its already present in SCP
		String s3 = "You can not change me";
		System.out.println(s1 == s3);// false

//		 no new object will be created in SCP
		String s4 = "You can not change me";
//		 true because pointing same object
		System.out.println(s3 == s4);// true

//		no object will be created in SCP because both are constant add in compiletime
//		this operation performed in compile time only  
		String s5 = "You can not" + " change me";
		
//		true because both are constant add in runtime pointing to same object 
		System.out.println(s3 == s5);// true

//		one object will created in SCP 
		String s6 = "You can not";

//		2 object will created on heap and one in SCP("change me")
//		in heap object created because operation done in runtime so compulsory new object will create in runtime
//		variable (S6) is present because it is done in runtime  
//		this operation will be performed in runtime only --one argument are runtime variable
		String s7 = s6 + " change me";
		
//		false because both are not pointing to the same object
		System.out.println(s3 == s7);// false

//		 no new object will be created --s6 already have "You can not" in SCP area
		final String s8 = "You can not";
		
//		no new object will created because s8 in final mean constant 
//		so "You can not" + "change me"  already present in the SCP area s5
//		this operation are performed in compile tile time both argument are compile time consent (final)
		String s9 = s8 + " change me";

		System.out.println(s3 == s9);// true
		System.out.println(s6 == s8);// true
	}
}
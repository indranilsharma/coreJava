package com.datatype.Literal.string.StringObject;

public class StringConstantPool {

	public static void main(String[] args) {
//		two object will be created --one in heap area and one in string content pool 
		String s = new String("Kajakistan");
//		only one object will be created string consent pool 
//		before creation of any new object it will first check in StringConstentPool (SCP) area  
//		All Scp area will be delete before JVM or server shutdown 
		String s1 = "Kabul";
		
//		here 2 objcet will be created in heap area
		String s2 = new String("Turkmanistan");
		String s3 = new String("Turkmanistan");
		
//		here only one object created in SCP area
		String s4 = "Turkmanistan";
		String s5 = "Turkmanistan";
		
//		here two object will created one in heap and one in SCP (for future reference)
		String s6 = new String("India");
		
//		"Pak" object will be created in SCP --because "Pak" literals
//		after this new object will be created in heap but having no reference ("IndiaPak") 	
//		so eligible for gc()
		s6.concat("Pak");
		
			
//		 two object will created one in SCP ("RTO") and other in heap ("IndiaRTO")
		String s7 = s6.concat("RTO");
//		one in SCP("Motovehicle") and one in heap ("IndiaMotovehicle") but having reference
//		now onwards s6 pointing to  IndiaMotovehicle
		s6 = s6.concat("Motovehicle");
		
		System.out.println(s6+"  "+s7);
		
//		total 8object created  4 object will be created in heap area 
//		--during runtime opereation (concat)
//		4 object in scp() because 4 constent are present ()
	}
}

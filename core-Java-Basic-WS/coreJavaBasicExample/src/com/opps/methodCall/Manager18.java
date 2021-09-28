package com.opps.methodCall;
/*
 * If manager16 in the bottom section it will show compile time error 
   because static method should be in first 
*/public class Manager18 {
	public static void main(String args[]) {
		boxApp obj = new boxApp();
		obj.height = 1;
        obj.length = 5;
        obj.width = 5;
        obj.volume();
        System.out.println(obj.volume);     
	}
}

class boxApp {
	 int width;
     int height;
     int length;
     int volume;
     void volume() {
          volume = width*height*length;
     } 
}
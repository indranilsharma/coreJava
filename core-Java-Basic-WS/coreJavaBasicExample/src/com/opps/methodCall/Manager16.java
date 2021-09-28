package com.opps.methodCall;
/*
 * If manager16 in the bottom section it will show compile time error 
   because static method should be in first 
*/public class Manager16 {
	public static void main(String args[]) {
		box obj = new box();
		obj.height = 1;
		obj.length = 5;
		obj.width = 5;
		obj.volume(3, 2, 1);
		System.out.println(obj.volume);
	}
}

class box {
	int width;
	int height;
	int length;
	int volume;

	void volume(int height, int length, int width) {
		volume = width * height * length;
	}
	/*public class Manager16 {
		public static void main(String args[]) {
			box obj = new box();
			obj.height = 1;
			obj.length = 5;
			obj.width = 5;
			obj.volume(3, 2, 1);
			System.out.println(obj.volume);
		}
	}*/
}

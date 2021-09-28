package com.allKeyword.Final.mehod;

//A final method may not be overridden

class MyClass1 {
	final void aMethod() {
		System.out.println("final method MyClass1");
	}
}

class Manager4 extends MyClass1 
{
	//final method can't be override 
	/*void aMethod() {
		System.out.println("aMethod() Manager4");
	}*/
	
	public static void main(String[] args) {
		Manager4 obj = new Manager4();
		//we can access but can't override
		obj.aMethod();
	}
}

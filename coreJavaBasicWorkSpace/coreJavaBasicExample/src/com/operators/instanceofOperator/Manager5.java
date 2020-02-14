package com.operators.instanceofOperator;

//You cannot use a String representing the name of the class as the right operand.
public class Manager5 {
	public static void main(String[] argv){
	        MyClass3 myObject = new MyClass3();
	        MyAnotherClass myObject2 = new MyAnotherClass();
	        
	        
	        //invalid ReferenceType
	        /*if(myObject instanceof "MyClass"){
	            System.out.println("myobject is an instance of MyAnotherClass");
	        }*/

	    }

}

class MyClass3 {

}

class MyAnotherClass3 extends MyClass3 {
}

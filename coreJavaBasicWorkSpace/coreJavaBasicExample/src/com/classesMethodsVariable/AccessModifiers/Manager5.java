package com.classesMethodsVariable.AccessModifiers;

//Can access modifiers be applied to local variables? NO! 
 
public class Manager5 {
	void doStuff() {
		//Illegal modifier for parameter x; only final is permitted
	    //private int x = 7;  // Error
	    //this.doMore(x);
	  }
}

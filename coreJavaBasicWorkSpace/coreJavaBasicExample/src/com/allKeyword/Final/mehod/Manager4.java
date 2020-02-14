package com.allKeyword.Final.mehod;

//A final method may not be overridden


class MyClass1{
	   final void aMethod() { }
	 }

	 class Manager4 //extends MyClass1 //can't able to extends
	 {
	   void aMethod() {
		   
	   }
	 }

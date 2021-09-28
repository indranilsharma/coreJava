package com.allKeyword.Final.Class;

//A final class cannot be subclassed


/*
 * One is definitely to prevent inheritance, as final classes cannot be
 * extended. For example, all Wrapper Classes like Integer,Float etc. are final
 * classes. We can not extend them.
 */


final class MyAnotherClass 
{
	static{
		System.out.println("SIB");
	}
}

 class Manager2  /*extends MyAnotherClass */{
	public static void main(String[] args) {
		System.out.println("main");
		MyAnotherClass obj = new MyAnotherClass();
		System.out.println(obj);
	}
}

package com.memoryCollection.staticMemory;

class Test1 {
  public void name() {
	System.out.println("base");
}
}
class Test2 extends Test1{
@Override
public void name() {
	System.out.println("derived");
}
}
public class Test{
	public static void main(String[] args) {
		Test1 o = new Test2();
		Test2 o1= new Test2();
	    o.name();
	    o1.name();
	}
}

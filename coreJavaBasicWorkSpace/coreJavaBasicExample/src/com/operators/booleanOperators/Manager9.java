package com.operators.booleanOperators;

/*
  Operator short circuit and, &&, skips evaluating right hand operand if 
  left hand operand is false thus division by zero in if condition does not give an error.
*/
public class Manager9 {
	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		boolean c = a ^ b; //true
		System.out.println(c);//true
		System.out.println(!c); //false
	}
}

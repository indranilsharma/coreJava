package com.operators.booleanOperators;

/*
Here, expression is a boolean expression which evaluates to either true or false. 
If it evaluates to true, expressionTrue is evaluated and assigned to variable number. 
If it evaluates to False, expressionFalse is evaluated and assigned to variable number.
*/
public class TernaryOperator {
	public static void main(String[] args) {
		Double number = 5.5;
		String result;

		result = (number > 0.0) ? "positive" : "not positive";
		System.out.println(number + " is " + result);
	}
}

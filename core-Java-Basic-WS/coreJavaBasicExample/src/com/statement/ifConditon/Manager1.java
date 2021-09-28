package com.statement.ifConditon;

	public class Manager1{
	    public static void main(String[] argv){
	        int x = 1;
	        int y = 0;
	        int z = 0;
	        int a = 0;
	        if (x > 3) {
	          System.out.println("x is greater than 3");
	        } else {
	          System.out.println("x is not greater than 3");//else block excuting
	        }
	        
	        //The else block is optional, so you can also use the following:
	        
	        if (x > 3) {
	          y = 2;
	        }
	        z += 8;
	        a = y + x;
	    }
	}
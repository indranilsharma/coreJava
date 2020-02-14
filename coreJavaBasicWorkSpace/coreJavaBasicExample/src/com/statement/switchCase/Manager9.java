package com.statement.switchCase;

public class Manager9 {
	public static void main(String[] argv){
        int x = 2;
        
        switch (x) {
          case 2:
          case 4:
          case 6:
          case 8:
          case 10: {
            System.out.println("x is an even number");
            break;//after break not a single statement will execute
          }
          default: System.out.println("x is an odd number");
        }
	}
}

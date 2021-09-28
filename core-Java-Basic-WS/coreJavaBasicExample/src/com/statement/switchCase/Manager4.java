package com.statement.switchCase;

public class Manager4 {
	public static void main(String[] argv){
        int temp = 90;
        switch(temp) {
          case 80 :  System.out.println("80");
          break;
         //case 80 :  System.out.println("80");   // won't compile!
          case 90 :  System.out.println("90");
          break;
          default :  System.out.println("default");
        }
    }
}

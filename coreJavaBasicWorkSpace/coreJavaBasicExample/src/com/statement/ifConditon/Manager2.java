package com.statement.ifConditon;

public class Manager2 {
	public static void main(String[] argv){
        int y = 1;
        int x = 21;
        if (((x > 3) & (y < 2)) & doStuff()) {
           System.out.println("false");
        }
    }
    static boolean doStuff(){
      return true;
    }
}

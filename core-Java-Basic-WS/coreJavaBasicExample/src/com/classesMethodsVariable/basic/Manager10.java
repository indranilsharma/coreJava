package com.classesMethodsVariable.basic;


class access{

    public int x;
	private int y;

    void cal(int a, int b){
        x =  a + 1;
        y =  b;
    }        
}    

public class Manager10 {
    public static void main(String args[]){
        access obj = new access();   
        obj.cal(2, 3);
        System.out.println(obj.x );     
       // System.out.println(obj.y); //variable is private can't be access from out side class.      
    }
}

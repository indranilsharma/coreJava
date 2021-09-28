package com.classesMethodsVariable.basic;


class area {

    int width;
    int length;
   // int height;
    int volume;

    area() {
     width=5;
     length=6;
    }

    void volume() {
       //  volume = width*length*height; //Variable height is not defined.
    } 
}    

public class Manager9 {
    public static void main(String args[]){
        area obj = new area();
        obj.volume();
        System.out.println(obj.volume);        
    } 
}

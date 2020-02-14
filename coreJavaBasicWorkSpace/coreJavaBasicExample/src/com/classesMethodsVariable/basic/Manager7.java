package com.classesMethodsVariable.basic;


class box12 {

    int width;
    int height;
    int length;
    int volume;

    void volume() {
         volume = width*height*length;
    } 
}    

public class Manager7 {
    public static void main(String args[]){
        box12 obj = new box12();
        obj.height = 1;
        obj.length = 5;
        obj.width = 5;
        obj.volume();

        System.out.println(obj.volume);        
    } 
}

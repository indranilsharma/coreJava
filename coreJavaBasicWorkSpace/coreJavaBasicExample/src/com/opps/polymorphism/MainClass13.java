package com.opps.polymorphism;

class A13
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class B13 extends A13
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}
 
public class MainClass13
{
    public static void main(String[] args)
    {
        A13 a = new B13();
         
        a.methodOne();
    }    
}
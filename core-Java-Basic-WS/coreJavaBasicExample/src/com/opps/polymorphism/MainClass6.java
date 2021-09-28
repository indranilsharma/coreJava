package com.opps.polymorphism;

class A6
{
    public A6(int i)
    {
        System.out.println(1);
    }
     
    public A6()
    {
        this(10);
         
        System.out.println(2);
    }
     
    void A6()
    {
        A6(10);
         
        System.out.println(3);
    }
     
    void A6(int i)
    {
        System.out.println(4);
    }
}
 
 
public class MainClass6 
{    
    public static void main(String[] args)
    {
        new A6().A6();
    }
}
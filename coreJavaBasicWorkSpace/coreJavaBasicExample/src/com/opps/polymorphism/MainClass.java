package com.opps.polymorphism;

class A1
{
    int i = 10;
}
 
class B1 extends A1
{
    int i = 20;
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A1 a = new B1();
 
        System.out.println(a.i);
    }
}
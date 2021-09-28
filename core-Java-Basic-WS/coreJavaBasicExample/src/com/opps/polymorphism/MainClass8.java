package com.opps.polymorphism;

class A8
{
     
}
 
class B8 extends A8
{
     
}
 
class C8 extends B8
{
     
}
 
public class MainClass8
{
    public static void main(String[] args)
    {
        A8 a = new A8();
         
        a = new B8();
         
        a = new C8();
    }
}
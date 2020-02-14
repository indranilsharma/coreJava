package com.opps.polymorphism;

class ABC15
{    
    void methodABC()
    {
        System.out.println(111);
    }
     
    void methodABC(int i)
    {
        System.out.println(222);
    }
}
 
class XYZ15 extends ABC15
{
    @Override
    void methodABC(int i)
    {
        System.out.println(333);
    }
     
    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}
 
public class MainClass15
{
    public static void main(String[] args)
    {
        ABC15 abc = new XYZ15();
         
        abc.methodABC(10);
         
        abc.methodABC();
    }    
}
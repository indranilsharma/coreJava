package com.opps.polymorphism;

class A2
{
     
}
 
class B2 extends A2
{
     
}
 
class C2 extends B2
{
     
}
 
public class MainClass1 
{
    static void overloadedMethod(A2 a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B2 b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
     
    public static void main(String[] args)
    {
        C2 c = new C2();
         
        overloadedMethod(c);
    }
}
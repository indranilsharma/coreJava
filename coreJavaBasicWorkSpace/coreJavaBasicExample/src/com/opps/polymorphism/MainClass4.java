package com.opps.polymorphism;

class X4
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}
 
class Y4 extends X4
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}
 
class Z4 extends Y4
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
 
public class MainClass4 
{    
    public static void main(String[] args)
    {
        X4 x = new Y4();
         
        x.calculate(10, 20);
         
        Y4 y = (Y4) x;
         
        y.calculate(50, 100);
         
        Z4 z = (Z4) y;
         
        z.calculate(100, 200);
    }
}
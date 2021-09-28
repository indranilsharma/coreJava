package com.opps.polymorphism;

class X9
{
    int method(int i)
    {
        return i *= i;
    }
}
 
class Y9 extends X9
{
    double method(double d)
    {
        return d /= d;    
    }
}
 
class Z9 extends Y9
{
    float method(float f)
    {
        return f += f;
    }
}
 
public class MainClass9
{
    public static void main(String[] args)
    {
        Z9 z = new Z9();
         
        System.out.println(z.method(21.12));
    }
}
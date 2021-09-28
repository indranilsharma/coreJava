package com.opps.polymorphism;

class ABC16
{    
    String myMethod(String s)
    {
        return s+s;
    }
}
 
class PQR16 extends ABC16
{
    String myMethod(String s, double d)
    {
        return myMethod(s+d);
    }
}
 
class XYZ16 extends PQR16
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);
    }
}
 
public class MainClass16
{
    public static void main(String[] args)
    {
        XYZ16 xyz = new XYZ16();
         
        System.out.println(xyz.myMethod(" JAVA :", 23.23, 111));
    }    
}
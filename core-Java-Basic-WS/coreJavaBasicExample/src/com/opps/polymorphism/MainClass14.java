package com.opps.polymorphism;

class ABC14
{
    void methodABC()
    {
        new XYZ14().methodXYZ();
    }
}
 
class XYZ14 extends ABC14
{
    void methodXYZ()
    {
        methodABC();
    }
}
 
public class MainClass14
{
    public static void main(String[] args)
    {
        new ABC14().methodABC();
    }    
}
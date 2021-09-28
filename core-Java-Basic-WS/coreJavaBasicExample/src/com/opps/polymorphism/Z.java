package com.opps.polymorphism;

class X20
{    
    void methodOfX()
    {
        System.out.println("Class X");
    }
}
 
class Y20 extends X20
{
    protected void methodOfX()
    {
        System.out.println("Class Y");
    }
}
 
class Z20 extends Y20
{
    public void methodOfX()
    {
        System.out.println("Class Z");
    }
}
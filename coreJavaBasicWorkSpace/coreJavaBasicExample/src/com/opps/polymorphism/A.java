package com.opps.polymorphism;

class A18
{
    void methodOne(Double D)
    {
         
    }
     
    int methodTwo18(Integer I) {
		return 0;
	}

	void methodOne18(double d) {
		
	}

	int methodTwo(Integer I)
    {
        return I;
    }
}
 
class B18 extends A18
{
    @Override
    void methodOne18(double d)
    {
         
    }
     
    @Override
    int methodTwo18(Integer I)
    {
        return (int)1.1;
    }
}
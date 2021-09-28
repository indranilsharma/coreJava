package com.datatype.array;

class student
{
	int sid;
	long phone;	
	
	
	 public int hashcode()
	
	{
		String s1=Integer.toString(sid);
		String s2=Long.toString(phone);
		int hash=s1.hashCode();
		hash+=s2.hashCode();
		return hash;
		
	}
	
	student(int sid,long phone)
	{
		this.sid = sid;
		this.phone = phone;
	}
}
public class HashCode
{
	public static void main(String[] args) {
		student s1 = new student(11,12345);
		student s2 = new student(11,12345);
		student s3 = new student(17,835675407);
		student s4 = s1;
		System.out.println("has code of s1 :"+s1.hashCode());//
		System.out.println("has code of s2 :"+s2.hashCode());// 
		System.out.println("has code of s3 :"+s3.hashCode());
		System.out.println("has code of s4 :"+s4.hashCode());//
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
	}
}

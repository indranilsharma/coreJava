package com.CollectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager3 {
	
	public static void main(String[] args) {
		
		 ArrayList list=new ArrayList();
		 list.add(9);
		 list.add(5);
		 list.add(90);
		 list.add(29);
		 list.add(2);
		 list.add(25);
		 ArrayList list1=new ArrayList();
		 list1.add(5);
		 list1.add(4);
		 list1.add(99);
		 System.out.println(list);
		 System.out.println(list1);
		 System.out.println("-------");
		 list.retainAll(list1);
		 System.out.println(list);
		 System.out.println(list1);
		 
		 
		 
	}
	

}
package com.CollectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager2 {

	public static void main(String[] args) {
		
		 ArrayList list=new ArrayList();
		 list.add(20);
		 list.add(4);
		 list.add(5);
		 list.add(23);
		 list.add(19);
		 list.add(25);
		 System.out.println(list);
		 Collections.sort(list);
		 System.out.println(list);
		 
		 
	}
	
}

package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Day4_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Collection 
		//1. List 
		//a.ArrayList
		//b.Linked List
		//c.Vector
		
		//2. set
		//a.hashset
		//b.Linkedhashset
		
		//3. Map
		//a.hashmap
		//b.Linkedhashmap
		//c.treemap
		
		//Arraylist 
		
		ArrayList <String> list1 = new ArrayList <String>();
		
		list1.add("Jan");
		list1.add("feb");
		list1.add("March");
		list1.add("april");
		
		list1.add(1, "x");
		list1.remove(1);
	boolean result=list1.contains("april");
		System.out.println(result);
		for (int i = 0; i < list1.size(); i++) {
			
			System.out.println(list1.get(i));
		}
		
		Set <Integer> set1 = new HashSet <Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
	
		for (Integer integer : set1) {
			
			System.out.println(integer);
		}
		
		HashMap <Integer, String> abc = new HashMap <Integer, String>();
		
		abc.put(100, "maran");
		abc.put(101, "Michael");
		abc.put(102, "siva");
		abc.put(103, "boss");
		abc.put(106, "karthik");
		
		
		System.out.println(abc.keySet());
		System.out.println(abc.values());
		
		for (Entry<Integer, String> integer : abc.entrySet()) {
			
			System.out.println(abc.entrySet());
			
			
		}
		
		
	}

}

package natWestJohnty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collection {


	public static void main(String[] args) {


		//Collection (I)

		// 1. List(I)

		//a. ArrayList
		//b.LinkedList
		//c.Vector

		//2. Set(I)
		//a. HashSet
		//b. LinkedSet

		//3. Map
		//a. HashMap
		//b. LinkedHashmap	
		//c. TreeSet




		List obj1 = new ArrayList();

		obj1.add(10);
		obj1.add("karthik");
		obj1.add("michael");
		System.out.println(obj1);


		ArrayList <String> obj2 = new ArrayList<String>();

		obj2.add("myname");

		obj2.add("karthik");
		obj2.add("michael");

		for (int i = 0; i < obj2.size(); i++) {
			System.out.println(obj2.get(i));
		}


		HashSet <Integer> obj3 = new HashSet<Integer>();
		obj3.add(10);
		obj3.add(20);
		obj3.add(30);
		obj3.add(30);
		obj3.add(40);

		int size = obj3.size();
		System.out.println(size);

		for (Integer integer : obj3) {

			System.out.println(integer);
		}

HashMap <Integer, String> obj4 = new HashMap <Integer, String>();

obj4.put(10, "myself");
obj4.put(20, "karthik");
obj4.put(30, "michael");
obj4.put(40, "manohar");

System.out.println(obj4.entrySet());
System.out.println(obj4.keySet());		
System.out.println(obj4.values());
		
	}
}







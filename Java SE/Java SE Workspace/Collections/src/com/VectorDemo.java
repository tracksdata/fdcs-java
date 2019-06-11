package com;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Object> ar = new Vector<>();

		// add elements
		ar.add("Praveen");
		ar.add(23234);
		ar.add(3876834.54f);
		ar.add('G');
		ar.add("Praveen");
		ar.add(1, "James");
		ar.add(5, 2);
		ar.add("Ravi123");
		System.out.println(ar);

		// get total elements side from arrayklist

		System.out.println(ar.size());

		// Delete on element from ArrayList

		ar.remove(2); // Removes Object at 2nd index
		ar.remove("Praveen"); // removes object value praveen in the AL at first occurence
		ar.remove(new Integer(2)); // Removes an Integer Object 2 from the AL

		// ar.clear();

		System.out.println(ar);

		System.out.println(ar.size());

		// Update data
		
		ar.set(0, 834738);
		System.out.println(ar);
		
		// Find Data
		
		System.out.println(ar.get(0));
		
		
		if(ar.contains("Ravi")) {
			ar.add("Raju");
		}
		
		System.out.println(ar);
		
		
		System.out.println("-----------------------");
		
		
		// 1 . For loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("-------------------------");
		
		// 2. For Each
		
		for(Object obj:ar) {
			if(obj.equals("Praveen")) {
			//.add("James Giedic");
			}
			System.out.println(obj);
		}
		
		System.out.println("-------------------------");
		
		System.out.println(ar);
		
		
		
		// 3.  Iterator
		
		System.out.println("-------------------------");
		
		Iterator<Object> it=ar.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("Praveen")) {
				//it.remove();
				//continue;
			}
			System.out.println(obj);
		}
		
		
		System.out.println("-------------------------");
		
		// 4. ListIterator
		
		ListIterator<Object> li=ar.listIterator();
		
		
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj.equals("Praveen")) {
				li.add("Prashanth");
				continue;
			}
			System.out.println(obj);
		}
		
		System.out.println("-------------");
		
		System.out.println(ar);
		
		//while(li.hasPrevious()) {
			//System.out.println(li.previous());
		//}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

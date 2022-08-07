package org.list;

import java.util.ArrayList;

public class List {
	public  static void main(String[] args) {
		
		ArrayList i = new ArrayList();
		
		i.add("bala");
		i.add("ram");
		i.add(3);
		i.add(500);
		i.add("Ravi");
		i.add(true);
		i.add("ABC");
		i.add(100);
		i.add(50);
		i.add("End");

		System.out.println(i);
		
		int size = i.size();
		System.out.println(size);
		
		
		boolean remove = i.remove(true);
		System.out.println(remove);
		
		System.out.println(i);
		
		Object object = i.get(5);
		System.out.println(object);
		
		Object set = i.set(4, "bv");
		System.out.println(set);
		
		System.out.println(i);
		int indexOf = i.indexOf("End");
		System.out.println("Index  "  + indexOf);
		
		
		ArrayList a = new ArrayList();
		a.add("java");
		a.add("Selenium");
		a.add("phyton");
		
		System.out.println(a);
		
      boolean addAll = a.addAll(i);
      System.out.println(addAll);
      System.out.println(a);
      
      boolean addAll2 = a.addAll(1, i);
      System.out.println(addAll2);
      
      System.out.println(a);
      
      int lastIndexOf = a.lastIndexOf("java");
      System.out.println(lastIndexOf);
      
      
      
		
		
		
		
		
		
		
			}

}

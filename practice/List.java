package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(59);
		list.add(90);
		list.add(55);
		list.add(66);
		list.add(35);
		list.add(34);
// Q1.Print the Five Integers
//		System.out.println("The Five Integers are");
//		System.out.println(list);

// Q2.Display all elements of a list using for each loop
//		System.out.println("Elements are:");
//		for (Integer integer : list) {
//			System.out.println(integer);
		

//Q3.Add an elements at the specific index		
//			list.add(0, 89);
//			System.out.println(list);
		
//Q4.Remove element from a list
//			list.remove(3);
//			System.out.println(list);
		
// Q5.Find the size of list
//			list.size();
//			System.out.println(list.size());
		
// Q6 Check whether list is Empty or not
//		list.isEmpty();
//		System.out.println(list.isEmpty());

// Q7Retrive an element from a list using get()method
//		list.get(1);
//		System.out.println(list.get(1));

// Q8.Create Hashset and add 5 String values
//		HashSet<String> s = new HashSet<String>();
//		s.add("Pranali");
//		s.add("Apporva");
//		s.add("Avantika");
//		s.add("Pragati");
//		s.add("Amisha");
//		System.out.println(s);

// Q9 Try to add Duplicates elements in a set and observe the output
//		Set<Integer>s1=new HashSet<Integer>();
//		s1.add(12);
//		s1.add(80);
//		s1.add(80);
//		s1.add(34);
//		s1.add(67);
//		s1.add(11);
//		s1.add(34);
//		System.out.println(s1);
		
// Q10Display all elements of set using for each loop
//		Set<String>set1=new LinkedHashSet<String>();
//		//System.err.println("Elements of set are ");
//		set1.add("Pune");
//		set1.add("Nashik");
//		set1.add("Thane");
//		set1.add("Mumbai");
//		set1.add("Prathmesh");
//		set1.add("Ayush");

//		for (String string : set1) {
//			System.out.println(string);
		
		
// Q11Check whether the a specific elements exist in a set
//			set1.contains("sangli");
//			System.out.println(set1.contains("sangli"));
		
		
// Q12.Remove an element from a set
//			Set<Integer>set2=new HashSet<Integer>();
//			set2.add(100);
//			set2.add(139);
//			set2.add(234);
//			set2.add(456);
//			set2.add(345);
//			set2.add(345);
//			
//			set2.remove(234);
//			System.out.println(set2);

// Q13.Find the total numbers of elements in a set
//			Set<Integer>set3=new HashSet<Integer>();
//			set3.add(100);
//			set3.add(139);
//			set3.add(234);
//			set3.add(456);
//			set3.add(345);
//			set3.add(345);
//			set3.size();
//			System.out.println(set3.size());
		
// Q14
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(101, "Pranali");
//		hm.put(102, "Swati");
//		hm.put(103, "Shruti");
//		hm.put(104, "Prapti");
//		hm.put(105, "Vidya");
//		System.out.println(hm);
		
// Q15Display all key-Value pairs using entrySet
//		Map<Integer, String> h = new HashMap();
//		h.put(1, "Ganesh");
//		h.put(2, "Rahul");
//		h.put(3, "Pranav");
//		h.put(4, "Ashish");
//		h.put(5, "Atharv");
//		System.out.println(h);
//		for (Entry<Integer, String> entry : h.entrySet()) {
//			System.out.println(entry.getKey() + " = " + entry.getValue());

// Q16Retrive a value using a key from map
//			Map<Integer, String> h1 = new HashMap();
//			h1.put(1, "Ganesh");
//			h1.put(2, "Rahul");
//			h1.put(3, "Pranav");
//			h1.put(4, "Ashish");
//			h1.put(5, "Atharv");
//			//System.out.println(h1);
//			System.out.println(h1.get(4));

// Q17check whether a value exist in map
//		Map<Integer, String> h3 = new HashMap();
//		h3.put(1, "Ganesh");
//		h3.put(2, "Rahul");
//		h3.put(3, "Pranav");
//		h3.put(4, "Ashish");
//		h3.put(5, "Atharv");
		// System.out.println(h3);
		// System.out.println(h3.containsKey(1));
		
		
// Q18.Check whwther a value exists in map
//		Map<Integer, String> h4 = new HashMap();
//		h4.put(1, "Ganesh");
//		h4.put(2, "Rahul");
//		h4.put(3, "Pranav");
//		h4.put(4, "Ashish");
//		h4.put(5, "Atharv");
//		System.out.println(h4.containsValue("Ganesh"));
		
// Q19Remove an entry from map using key
		Map<Integer, String> h5 = new HashMap();
		h5.put(1, "Ganesh");
		h5.put(2, "Rahul");
		h5.put(3, "Pranav");
		h5.put(4, "Ashish");
		h5.put(5, "Atharv");
		h5.remove(5);
		System.out.println(h5);
		
		// Q20 Find the size of Map
		Map<Integer, String> h6 = new HashMap();
		h6.put(1, "Ganesh");
		h6.put(2, "Rahul");
		h6.put(3, "Pranav");
		h6.put(4, "Ashish");
		h6.put(5, "Atharv");

		System.out.println(h6.size());

	}

}

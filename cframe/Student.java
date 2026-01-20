package com.cframe;

import java.util.ArrayList;

public class Student {
	public static void main(String[] args) {
		
	
		ArrayList list = new ArrayList();
		
		list.add("Student Name");
		list.add("age");
		list.add("Roll NO");
		list.add("City");
		list.add("contact No");
		list.add("email");
		//System.out.println(list);
		
	
		
		ArrayList list2 = new ArrayList();
		
		list2.add("Pranali");
		list2.add(20);
		list2.add(101);
		list2.add("Pune");
		list2.add(7463284767l);
		list2.add("pk9579@gmail.com");
		//System.out.println(list2);
		//System.out.println(list);
		//list2.addAll(list);
		//System.out.println(list2.reversed());
		System.err.println("Student Details..!!!");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+ " : "+list2.get(i));
		
		}
		
		
		
		
		
	
		
	
	
	

}
}


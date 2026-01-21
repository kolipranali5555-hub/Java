package com.collectionfday4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		System.out.println(list);

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Pranali");
		list1.add("101");
		list1.add("20");
		list1.add("Pune");
		list1.add("pk@gmail.com");
		Map<Integer, String> map = new LinkedHashMap<>();

//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)+"\t"+list1.get(i));
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), list1.get(i));
		}
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}
}

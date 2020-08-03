package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		h.put(1, 100);
		h.put(2,200);
//		System.out.println(h.containsKey(3));
//		System.out.println(h.containsValue(200));
//		System.out.println(h.get(1));
//		System.out.println(h.get(3));
//		System.out.println(h.getOrDefault(3, h.get(2)));
		h.putIfAbsent(3, 300);
		
		for(Map.Entry e: h.entrySet())
		{
			System.out.println(e.getKey()+ " "+ e.getValue());
		}
		

	}

}

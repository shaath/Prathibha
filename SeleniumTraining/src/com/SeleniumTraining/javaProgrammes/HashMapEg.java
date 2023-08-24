package com.SeleniumTraining.javaProgrammes;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("cat", "puppy");
		hm.put("Fruite", "Apple");
		hm.put("Game", "Cricket");
		
//		System.out.println(hm);
		
//		System.out.println(hm.get("Fruite"))
		
		for(Map.Entry<String, String> d: hm.entrySet()){
			System.out.println(d.getKey() + "-----" + d.getValue());
		}
		

	}

}

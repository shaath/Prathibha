package com.SeleniumTraining.javaProgrammes;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Cat");
		hs.add(4774);
		hs.add(true);
		hs.add('M');
		hs.add(52352.23423);
//		hs.remove(true);
//		hs.clear();
		hs.add(true);
		
		System.out.println(hs.size());
		
		for(Object data: hs){
			System.out.println(data);
		}

	}

}

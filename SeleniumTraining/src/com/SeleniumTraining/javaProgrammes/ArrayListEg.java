package com.SeleniumTraining.javaProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		List<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add("Sudiksha");
		al.add("Prathibha");
		al.add(200000);
		al.add(true);
		al.add(5, 5252.324324);
		al.add(3, 172000);
		al.set(4, 220000);
		al.add(7, "UFT");
//		al.remove(5);
//		al.clear();
		
		ArrayList<String> bl = new ArrayList<>();
		bl.add("Sharat");
		bl.add("Boll");
		bl.add("Tree");
		al.addAll(bl);
		
		System.out.println(al.size());
		
//		System.out.println(al.get(2));
		for(Object d: al){
			System.out.println(d);
		}
		System.out.println("***********");
//		Collections.sort(bl);
		Collections.sort(bl, Collections.reverseOrder());
		
		al.addAll(bl);
		for(String x: bl){
			System.out.println(x);
		}
		

	}

}

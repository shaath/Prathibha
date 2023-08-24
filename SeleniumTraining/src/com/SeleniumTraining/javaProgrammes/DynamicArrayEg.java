package com.SeleniumTraining.javaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		String[] s = new String[5];
		
		System.out.println(s.length);
		
		s[0] = "Selenium";
		s[2] = "Prathibha";
		s[3] = "Sudiksha";
		s[4] = "Apple";
		
//		System.out.println(s[2]);
		
		for(String p: s){
			System.out.println(p);
		}
	}

}

package com.SeleniumTraining.javaProgrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = new Object[5];
		
		System.out.println(x.length);
		
		x[0] = "Apple";
		x[1] = 40000;
		x[2] = true;
		x[3] = 'M';
		x[4] = 53252.32324;
		
		for(Object d : x){
			System.out.println(d);
		}
	}

}

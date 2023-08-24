package com.SeleniumTraining.javaProgrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][] x = new Object[2][3];
		
		System.out.println("Length of the rows " + x.length);
		System.out.println("Length of the 0th indexed row " + x[0].length);
		
		x[0][1] = "Apple";
		x[1][0] = "Sudiksha";
		
		System.out.println(x[1][0]);
		
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}
}

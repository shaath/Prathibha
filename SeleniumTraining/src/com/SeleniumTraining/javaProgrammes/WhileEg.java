package com.SeleniumTraining.javaProgrammes;

public class WhileEg {

	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 500)
//		{
//			if (i == 251) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		int i = 500;
		while(i >= 1){
			System.out.println(i);
			i--;
			if(i == 349){
				break;
			}
		}
	}
}

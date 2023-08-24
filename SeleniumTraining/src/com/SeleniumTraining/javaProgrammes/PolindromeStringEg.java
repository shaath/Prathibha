package com.SeleniumTraining.javaProgrammes;

public class PolindromeStringEg {

	public static void main(String[] args) {
		
		String x = "selenium";  //muineleS
		String rev = "";
		
		int len = x.length();
		
//		for(int i = len - 1; i >= 0; i--)
//		{
////			System.out.print(x.charAt(i));
//			rev = rev + x.charAt(i);
//		}
//		System.out.println(rev);
//
//		if(x.equalsIgnoreCase(rev)){
//			System.out.println("Given String is a polindrome");
//		}else{
//			System.out.println("Given String is not a polindrome");
//		}
		boolean flag = false;
		int index = 0;
		for(int i = len - 1; i >= 0; i--){
			if(x.charAt(i) == x.charAt(index)){
				flag = true;
				index++;
			}else{
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Given String is a polindrome");
		}else{
			System.out.println("Given String is not a polindrome");
		}
	}

}

package com.SeleniumTraining.javaProgrammes;

public class FailedTcCountEg {

	public static void main(String[] args) {
		
		String x = "69 test cases passed out of 90 test cases";
		
//		String y = x.replace(" test cases passed out of", "");
//		String z = y.replace(" test cases", "");
//				
//		System.out.println(z);
//
//		String[] a = z.split(" ");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		
//		int pCnt = Integer.valueOf(a[0]);
//		int tCnt = Integer.valueOf(a[1]);
//		
//		int fCnt = tCnt - pCnt;
//		System.out.println("Failed test cases count " + fCnt);
		
		System.out.println(Integer.valueOf(x.split(" ")[6]) - Integer.valueOf(x.split(" ")[0]));
				
	}

}

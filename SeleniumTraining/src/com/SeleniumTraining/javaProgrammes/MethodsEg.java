package com.SeleniumTraining.javaProgrammes;

public class MethodsEg {
	public int a = 30, b = 40;
	public static void main(String[] args) {
		
		Function1();
		String res = Function2();
		System.out.println(res);
		
		MethodsEg me = new MethodsEg();
		
		me.Function3();
		boolean flag = me.Function4();
		System.out.println(flag);
	}
	
	public MethodsEg(){
		System.out.println("This is a cnstructor code");
	}
	
	public MethodsEg(String a, int b){
		System.out.println("Name:"+a+",  "+"age:"+b);
	}
	
	// Static method without returning any value
	public static void Function1(){
		System.out.println("This is Function1 code");
	}
	
	//Static method with returning value
	public static String Function2(){
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non Static method without returning any value
	public void Function3(){
		System.out.println("This is Function3 code");
	}
	
//	Non static method with returning value
	public boolean Function4(){
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a, int b){
		int c = a + b;
		return c;
	}
	
	public int sum(int a, int b, int c){
		return a + b + c;
	}
	
}

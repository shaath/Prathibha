package com.SeleniumTraining.javaProgrammes;

public class InheritanceEg extends MethodsEg {

	public static void main(String[] args) {
		Function1();
//		String res = Function2();
//		System.out.println(res);
//		
		MethodsEg me = new MethodsEg();
		me.Function1();
//		me.Function3();
	}

	public static void Function1(){
		System.out.println("This is InheritanceEg Function1 code");
	}
} 

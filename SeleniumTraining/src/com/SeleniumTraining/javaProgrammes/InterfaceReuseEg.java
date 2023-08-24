package com.SeleniumTraining.javaProgrammes;

public class InterfaceReuseEg {

	public static void main(String[] args) {
		
		InterfaceEg ie1 = new InterfaceEgImplementsEg1();
		ie1.Vehicle();
		
		InterfaceEg ie2 = new InteraceEgImplementsEg2();
		ie2.Vehicle();

	}

}

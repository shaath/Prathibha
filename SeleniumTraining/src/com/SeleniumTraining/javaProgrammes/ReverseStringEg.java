package com.SeleniumTraining.javaProgrammes;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

public class ReverseStringEg {

	public static void main(String[] args) {
		
		String x = "Selenium";
		
		StringBuffer sb = new StringBuffer(x);		
		System.out.println(sb.reverse());

	}

}

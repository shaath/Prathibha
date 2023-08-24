package com.SeleniumTraining.javaProgrammes;

public class SwitchCaseEg {

	public static void main(String[] args) {
		
		String strCourse = "Selenium";
		
		switch(strCourse){
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "Selenium":
			System.out.println("YOu are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}

package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
	
	//private int pin;
	
	

	/*
	 * void validation() {
	 * 
	 * int [] pin= {0,1,2,3,4,5,6,7,8,9};
	 * System.out.println("Enter your pin Please :-" + " " ); Scanner test= new
	 * Scanner(System.in); var pin1 = test.nextInt();
	 * 
	 * if(pin.equals(pin1)) { System.out.println("Your Pin was Set Seccussfully");
	 * 
	 * }else {
	 * 
	 * System.out.println("Please Enter A valid Numeric Vlaue for Pin"); } }
	 */

	void testPin() {
		try {
		Scanner test = new Scanner(System.in);
	
		System.out.println("Please Enter Your Pin here:-"+ " ");
		int [] numbers = {0,1,2,3,4,5,6,7,8,9};
	    int pin = test.nextInt();
		
		
		int[] num= new int[4];
		num[0]=test.nextInt();
		num[1]=test.nextInt();
		num[2]=test.nextInt();
		//num[3]=test.nextInt();
		//num[4]=test.nextInt();
		
		for(int validpin:numbers ) {
			
			if(validpin==pin) {
				System.out.println("Pin set Successfully :-"  + num);
		 }
		}
		}catch (InputMismatchException ime) {
			System.out.println("Please Enter the valid Numeric Pin");
		}
	
 }		
		
      public static void main(String[] args) {

		Validation val=new Validation();
		System.out.println("********Welcome to Validtation*********\n");
		//val.validation();
		val.testPin();
		

	}

}

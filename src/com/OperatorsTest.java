package com;

import java.util.Scanner;

public class OperatorsTest {
	
	final void test() {
		
		/*
		 * int x = 50; int y=20; int z=x+9; if ((z > y) & (z<x) ) {
		 * System.out.println("True"); } else { System.out.println("False"); }
		 * 
		 * for(int n=1;n<=100;n++) {
		 * 
		 * if(n%5==0) { System.out.println("Divisible by 5" + " FOO :"+ n); } else
		 * if(n%7==0) { System.out.println("Divisible by 7"+ " BAR :"+ n); } if(n%5==0
		 * && n%7==0) { System.out.println("Divisible by both 5 & 7" +" FOO-BAR :"+ n);
		 * } //System.out.println("The Normal Non-Divisible Number's:" + " "+ n); }
		 */
		
		Scanner test = new Scanner(System.in);
		System.out.print("Please Enter the Number you want to Check : " + " ");
		int inputUserNumber =test.nextInt();
		
		if(inputUserNumber%5==0) {
			System.out.println("Divisible by 5" + " FOO :"+ inputUserNumber);
			
		}	
	    if(inputUserNumber%7==0) {
			System.out.println("Divisible by 7"+ " BAR :"+ inputUserNumber);
		 }
	    
		 if(inputUserNumber%5==0 && inputUserNumber%7==0) {
			System.out.println("Divisible by both 5 & 7" +" FOO-BAR :"+ inputUserNumber);
		}
		 
		 else {
				System.out.println("\nThe Number Doesn't Divisible by any These Given Number:"+ " " + inputUserNumber);
		 }
			
		 
		}

	public static void main(String[] args) {

		System.out.println("***********Welcome to Operator Test Class*************\n");
		OperatorsTest oT = new OperatorsTest();
		oT.test();
	}

}

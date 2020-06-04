package com;

import java.util.Scanner;

public class PrimeNumberTest {

	void testPrimeNumber() {
		
		Scanner number = new Scanner(System.in);
		System.out.print("\nEnter the Number in between you want to print PrimeNumber:" + " ");
		int userInput=number.nextInt();
		


		/*
		 * int i =0; int num =0;
		 */
	     
	       String  primeNumbers = "";

	       for (int i = 1; i <= userInput; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       
	       System.out.println("\nThe Prime Number's are:"+" "+ primeNumbers);
	   }
	


		
	/*	for(int number =1; number<100;number++) {
			
			for(int j=2;j<=number;j++) {
				
				if(number%j==0) {
					System.out.println("It's Prime Number");
				}
			}
			if(number==2)
			System.out.println("It's Not PrimeNumber");
			
			 * if ( number%2==1 && !(number%3)==0) { System.out.println(number+ ":"+
			 * "This is a PrimeNumber"); }else { System.out.println(number+
			 * ":"+"it's Not a PrimeNumber"); }
			 
		}
		*/
	
	public static void main(String[] args) {
		
		System.out.println("*****Welcome to Prime Number Varification Program********");
		
		PrimeNumberTest pnt =  new PrimeNumberTest();
		pnt.testPrimeNumber();
		
		
		
//-----------------------------Finding the smallest number in array----------------------------
		
	    int smallest=0; int large=0; int num;
	    System.out.print("\nenter the number:-"+" ");
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
	    num=input.nextInt();
	    smallest = num;
	    for(int i=0;i<n-1;i++)
	        {
	            num=input.nextInt();
	            if(num<smallest)
	            {
	                smallest=num;
	            }
	            
	            if(num>large) {
	            	large=num;
	            }
	        }
	        System.out.println("the smallest is:"+smallest);
	        System.out.println("the largest number is:"+large);
	}
		
		
		

		
}


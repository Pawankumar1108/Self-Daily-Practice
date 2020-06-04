package com;

public class ConditionalStatement {

	public static void main(String[] args) {
	System.out.println("******Welcome to Cahpter 6  ************\n ");
	
	
	int x=2,y=5;
		if ((x>1)&& (y<2) | doStuff()) {
		System.out.println("true");
	}
		
 

	
	
	if(true ^ false) {
		System.out.println("Something");
	}else {
		System.out.println("Nothing");
		}
	
	boolean b= false;
	if(b=true)
		System.out.println("somrthing else");
	
	final int v=10;
	final int g= 18;
	final int c=81;
	final int d=0;
   final int f=9;
    int n=0;
    String s= "Hello";
    long l=880;//Not Possible to use  in the Switch case
    float f2=1.0f;//it's is also not possible to use in the Switch case
    byte b1=4;
    char c2=9;
    char c3='p';
	short s2= (short)255555;
	Integer i1=555;
	int [] arry = {5,6,8,7,9};
	
	switch(i1) {
	case (500):System.out.println("into the byte section");
			/*
			 * case 4:System.out.println("into the real Byte Section"); break; //case
			 * (byte)128: case v: System.out.println("1"); case g:System.out.println("2");
			 * case d:System.out.println("9"); case c:System.out.println("0");
			 */
	break;
	default :
		System.out.println("all oky!");
	}

}
	private static boolean doStuff() { 
		
		return false;
		}
}
 